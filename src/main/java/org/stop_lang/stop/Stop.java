package org.stop_lang.stop;

import org.antlr.symtab.Symbol;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stop_lang.stop.models.*;
import org.stop_lang.stop.models.Enumeration;
import org.stop_lang.stop.parser.StopLexer;
import org.stop_lang.stop.parser.StopParser;
import org.stop_lang.stop.symbols.*;
import org.stop_lang.stop.validation.*;

import java.io.IOException;
import java.util.*;

public class Stop {
    private final static String REFERENCE_DELIMETER = ".";

    private Map<String, State> states;
    private Map<String, Enumeration> enumerations;

    public Stop(String filename) throws IOException, StopValidationException {
        CharStream input = CharStreams.fromFileName(filename);
        validate(input);
    }

    public Stop(CharStream input) throws StopValidationException {
        validate(input);
    }

    public Set<State> getStartStates(){
        Set<State> startStates = new HashSet<State>();
        for (State state : states.values()){
            if (state.isStart()){
                startStates.add(state);
            }
        }
        return startStates;
    }

    public Map<String, State> getStates(){
        return this.states;
    }
    public Map<String, Enumeration> getEnumerations(){
        return this.enumerations;
    }

    private void validate(CharStream input) throws StopValidationException {
        StopLexer l = new StopLexer(input);
        TokenStream tokens = new CommonTokenStream(l);
        StopParser parser = new StopParser(tokens);
        ParserRuleContext tree = parser.file();

        if (tree.exception != null){
            throw new StopValidationException(tree.exception.getMessage());
        }

        ParseTreeWalker walker = new ParseTreeWalker();

        IncludePhase includes = new IncludePhase();
        walker.walk(includes, tree);

        handleErrors(includes.errors);

        DefPhase def = new DefPhase();
        walker.walk(def, tree);

        handleErrors(def.errors);

        RefPhase ref = new RefPhase(def.globals, def.scopes);
        walker.walk(ref, tree);

        handleErrors(ref.errors);

        StopPhase stop = new StopPhase(def.globals, def.scopes);
        walker.walk(stop, tree);

        handleErrors(stop.errors);

        states = new TreeMap<String, State>(String.CASE_INSENSITIVE_ORDER);
        enumerations = new TreeMap<String, Enumeration>(String.CASE_INSENSITIVE_ORDER);

        for (Symbol symbol : def.globals.getSymbols()){
            if (symbol instanceof ModelSymbol){
                ModelSymbol modelSymbol = (ModelSymbol)symbol;
                String name = modelSymbol.getName();

                State.StateType type = State.StateType.SYNC;

                if (modelSymbol.isStop()){
                    type = State.StateType.STOP;
                } else if (modelSymbol.isStart()){
                    type = State.StateType.START;
                } else if (modelSymbol.isQueue()){
                    type = State.StateType.QUEUE;
                }

                State state = new State(name, type);
                states.put(name, state);
            }
            if (symbol instanceof EnumSymbol){
                EnumSymbol enumSymbol = (EnumSymbol)symbol;
                String name = enumSymbol.getName();
                Enumeration enumeration = new Enumeration(name, enumSymbol.getValues());
                enumerations.put(name, enumeration);
            }
        }

        for (Symbol symbol : def.globals.getSymbols()){
            if (symbol instanceof ModelSymbol){
                ModelSymbol modelSymbol = (ModelSymbol)symbol;
                String name = modelSymbol.getName();
                State modelState = states.get(name);

                if (modelState == null){
                    throw new StopValidationException("model " + name + " not found");
                }

                TreeMap<String, State> transitions = new TreeMap<String, State>(String.CASE_INSENSITIVE_ORDER);
                for(TransitionSymbol transitionSymbol : modelSymbol.getTransitions()){
                    String transitionName = transitionSymbol.getName();
                    State transitionState = states.get(transitionName);
                    if (transitionState != null){
                        transitions.put(transitionName, transitionState);
                    }
                }
                modelState.setTransitions(transitions);

                TreeMap<String, State> enqueues = new TreeMap<String, State>(String.CASE_INSENSITIVE_ORDER);
                for(EnqueueSymbol enqueueSymbol : modelSymbol.getEnqueues()){
                    String enqueueName = enqueueSymbol.getName();
                    State enqueueState = states.get(enqueueName);
                    if (enqueueState != null){
                        enqueues.put(enqueueName, enqueueState);
                    }
                }
                modelState.setEnqueues(enqueues);

                TreeMap<String, State> errors = new TreeMap<String, State>(String.CASE_INSENSITIVE_ORDER);
                for(ThrowSymbol throwSymbol : modelSymbol.getErrors()) {
                    String errorTransitionName = throwSymbol.getName();
                    State errorState = states.get(errorTransitionName);
                    if (errorState!=null){
                        errors.put(errorTransitionName, errorState);
                    }
                }
                modelState.setErrors(errors);

                TreeMap<String, Enumeration> enumerations = new TreeMap<String, Enumeration>(String.CASE_INSENSITIVE_ORDER);
                for (Symbol childSymbol : modelSymbol.getSymbols()){
                    if (childSymbol instanceof EnumSymbol){
                        EnumSymbol enumSymbol = (EnumSymbol)childSymbol;
                        Enumeration enumeration = new Enumeration(enumSymbol.getName(), enumSymbol.getValues());
                        enumerations.put(enumeration.getName(), enumeration);
                    }
                }
                modelState.setEnumerations(enumerations);

                if (modelSymbol.getReturn()!= null){
                    Property.PropertyType returnPropertyType;
                    String returnTypeString = modelSymbol.getReturn().getName();
                    State returnState = null;
                    try {
                        returnPropertyType = Property.PropertyType.valueOf(returnTypeString.toUpperCase());
                    }catch(IllegalArgumentException e){
                        returnPropertyType = Property.PropertyType.STATE;
                        returnState = states.get(returnTypeString);
                    }

                    modelState.setReturn(returnPropertyType, returnState, modelSymbol.getReturn().isCollection());
                }

                LinkedHashMap<String, Property> properties = new LinkedHashMap<String, Property>();
                for (Symbol childSymbol : modelSymbol.getSymbols()){
                    if (childSymbol instanceof StopFieldSymbol) {
                        StopFieldSymbol stopFieldSymbol = (StopFieldSymbol)childSymbol;
                        String symbolName = childSymbol.getName();
                        Property property = null;
                        State provider = null;
                        Map<String, String> providerMapping = null;
                        boolean optional = stopFieldSymbol.isOptional();
                        if ( stopFieldSymbol.getDynamicModel() != null){
                            provider = states.get(stopFieldSymbol.getDynamicModel().getName());
                            providerMapping = stopFieldSymbol.getDynamicModel().getSourceMapping();
                        }
                        if(childSymbol instanceof ModelFieldSymbol) {
                            String fullName = stopFieldSymbol.getTypeName();
                            State fieldState = states.get(fullName);
                            if (fieldState != null) {
                                property = new StateProperty(symbolName, fieldState, false, provider, optional, providerMapping);
                            }
                            Enumeration enumeration = enumerations.get(stopFieldSymbol.getSimpleTypeName());
                            if( enumeration==null){
                                enumeration = enumerations.get(stopFieldSymbol.getTypeName());
                            }
                            if (enumeration == null){
                                enumeration = this.enumerations.get(fullName);
                            }
                            if(enumeration!=null){
                                property = new EnumerationProperty(symbolName, enumeration, false, provider, optional);
                            }
                        }else if (childSymbol instanceof CollectionFieldSymbol){
                            CollectionFieldSymbol collectionFieldSymbol = (CollectionFieldSymbol)childSymbol;
                            Property.PropertyType propertyType;
                            if (collectionFieldSymbol.isState()){
                                String typeName = collectionFieldSymbol.getTypeName();
                                State fieldState = states.get(typeName);
                                property = new StateProperty(symbolName, fieldState, true, provider, optional, providerMapping);
                            }else {
                                Enumeration enumeration = enumerations.get(collectionFieldSymbol.getTypeName());
                                if(enumeration!=null){
                                    property = new EnumerationProperty(symbolName, enumeration, false, provider, optional);
                                }else {
                                    propertyType = getPropertyType(collectionFieldSymbol.getTypeName());
                                    property = new Property(symbolName, propertyType, true, provider, optional, providerMapping);
                                }
                            }
                        }else if (childSymbol instanceof ScalarFieldSymbol){
                            ScalarFieldSymbol scalarFieldSymbol = (ScalarFieldSymbol)childSymbol;
                            Property.PropertyType propertyType = getPropertyType(scalarFieldSymbol.getTypeName());

                            if(propertyType!=null){
                                property = new Property(symbolName, propertyType, false, provider, optional, providerMapping);
                            }
                        }
                        if (property!=null){
                            properties.put(symbolName, property);
                        }
                    }
                }
                modelState.setProperties(properties);
            }
        }

        for (Symbol symbol : def.globals.getSymbols()) {
            if (symbol instanceof ModelSymbol) {
                ModelSymbol modelSymbol = (ModelSymbol) symbol;
                String name = modelSymbol.getName();
                State modelState = states.get(name);

                if (modelState == null) {
                    throw new StopValidationException("model " + name + " not found");
                }

                for (Map.Entry<String, Map<String,String>> entry : modelSymbol.getModelAnnotations().entrySet()) {
                    State inheritState = states.get(entry.getKey());
                    if (inheritState == null) {
                        throw new StopValidationException("inherited model " + entry.getKey() + " not found");
                    }
                    StateAnnotation stateAnnotation = new StateAnnotation(inheritState, entry.getValue());
                    modelState.addAnnotation(stateAnnotation);
                }

                for (Annotation annotation : modelSymbol.getAnnotations()){
                    modelState.addAnnotation(annotation);
                }
            }
        }

        validateStateProperties();
    }

    private static Property.PropertyType getPropertyType(String typeName){
        switch(typeName){
            case "double":
                return Property.PropertyType.DOUBLE;
            case "float":
                return Property.PropertyType.FLOAT;
            case "int32":
                return Property.PropertyType.INT32;
            case "int64":
                return Property.PropertyType.INT64;
            case "uint32":
                return Property.PropertyType.UINT32;
            case "uint64":
                return Property.PropertyType.UINT64;
            case "sint32":
                return Property.PropertyType.SINT32;
            case "sint64":
                return Property.PropertyType.SINT64;
            case "fixed32":
                return Property.PropertyType.FIXED32;
            case "fixed64":
                return Property.PropertyType.FIXED64;
            case "sfixed32":
                return Property.PropertyType.SFIXED32;
            case "sfixed64":
                return Property.PropertyType.SFIXED64;
            case "bool":
                return Property.PropertyType.BOOL;
            case "string":
                return Property.PropertyType.STRING;
            case "bytes":
                return Property.PropertyType.BYTES;
            case "timestamp":
                return Property.PropertyType.TIMESTAMP;
            default:
                throw new IllegalArgumentException("Invalid type name");
        }
    }

    private void handleErrors(List<Exception> exceptions) throws StopValidationException {
        if (!exceptions.isEmpty()) {
            List<String> exceptionMessages = new ArrayList<>();
            for (Exception exception : exceptions){
                exceptionMessages.add(exception.getMessage());
            }
            throw new StopValidationException(String.join(", ", exceptionMessages));
        }
    }

    private void validateStateProperties() throws StopValidationException{
        for (State state : this.states.values()){
            validateStateProperties(state);
        }
    }

    private void validateStateProperties(State state)
            throws StopValidationException{
        LinkedHashMap<String, Property> orderedProperties = new LinkedHashMap<>();
        LinkedHashMap<String, Property> unorderedProperties = state.getProperties();

        // Insert properties without providers first
        for (Map.Entry<String, Property> unorderedPropertyEntry : unorderedProperties.entrySet()) {
            if (unorderedPropertyEntry.getValue().getProvider()==null){
                orderedProperties.put(unorderedPropertyEntry.getKey(), unorderedPropertyEntry.getValue());
            }
        }

        // Map dependents
        Map<Property, Set<Property>> dependents = new HashMap<Property, Set<Property>>();
        for (Map.Entry<String, Property> propertyEntry : state.getProperties().entrySet()) {
            Property property = propertyEntry.getValue();
            if (property.getProvider() != null) {
                Set<Property> providerProperties = new HashSet<>();
                for (Map.Entry<String, Property> providerPropertyEntry : property.getProvider().getProperties().entrySet()){
                    if (providerPropertyEntry.getValue().getProvider()==null) {
                        String propertyName = providerPropertyEntry.getKey();
                        if (property.getProviderMapping() != null) {
                            if (property.getProviderMapping().containsKey(propertyName)) {
                                propertyName = property.getProviderMapping().get(propertyName);
                            }
                            propertyName = getRootFromPropertyName(propertyName);
                        }
                        Property providerProperty = state.getProperties().get(propertyName);
                        if ((providerProperty != null) && (providerProperty.getProvider() != null)) {
                            providerProperties.add(providerProperty);
                        }
                    }
                }
                dependents.put(property, providerProperties);
            }
        }

        // Create initial ordered list
        List<Property> orderedDependencies = orderDependencies(dependents);

        // Insert in ordered map
        for (Property property : orderedDependencies){
            orderedProperties.put(property.getName(), property);
        }

        // Set new properties on state
        state.setProperties(orderedProperties);
    }

    private List<Property> orderDependencies(Map<Property, Set<Property>> dependencies) throws StopValidationException{
        List<Property> result = new ArrayList<Property>();
        Set<Property> visited = new HashSet<Property>();
        Set<Property> expanded = new HashSet<Property>();

        for (Property property : dependencies.keySet()){
            explore(property, dependencies, result, visited, expanded);
        }

        return result;
    }

    private static <Property> void explore(Property node, Map<Property, Set<Property>> dependencies,
                                    List<Property> ordering, Set<Property> visited,
                                    Set<Property> expanded) throws StopValidationException{
        /* Check whether we've been here before.  If so, we should stop the
         * search.
         */
        if (visited.contains(node)) {
            /* There are two cases to consider.  First, if this node has
             * already been expanded, then it's already been assigned a
             * position in the final topological sort and we don't need to
             * explore it again.  However, if it hasn't been expanded, it means
             * that we've just found a node that is currently being explored,
             * and therefore is part of a cycle.  In that case, we should
             * report an error.
             */
            if (expanded.contains(node)) return;
            throw new StopValidationException("Dynamic property dependency graph contains a cycle.");
        }

        /* Mark that we've been here */
        visited.add(node);

        /* Recursively explore all of the node's predecessors. */
        for (Property predecessor: dependencies.get(node))
            explore(predecessor, dependencies, ordering, visited, expanded);

        /* Having explored all of the node's predecessors, we can now add this
         * node to the sorted ordering.
         */
        ordering.add(node);

        /* Similarly, mark that this node is done being expanded. */
        expanded.add(node);
    }

    private String getRootFromPropertyName(String propertyName){
        String rootPropertyName = propertyName;

        if (propertyName.contains(REFERENCE_DELIMETER)) {
            String[] parts = propertyName.split("\\"+REFERENCE_DELIMETER);
            if (parts.length > 1) {
                rootPropertyName = parts[0];
            }
        }
        return rootPropertyName;
    }
}
