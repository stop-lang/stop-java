package org.stop_lang.stop.models;

import org.stop_lang.stop.validation.StopValidationException;

import java.util.*;

public class State {
    public enum StateType {
        SYNC,
        START,
        STOP,
        QUEUE
    }

    protected String name;
    protected Map<String, State> transitions;
    protected Map<String, State> errors;
    protected LinkedHashMap<String, Property> properties;
    protected Map<String, Enumeration> enumerations;
    protected Map<String, State> enqueues;
    protected StateType type;
    protected Property.PropertyType returnType = null;
    protected State returnState = null;
    protected boolean returnCollection = false;
    protected Collection<Annotation> annotations;

    public State(String name){
        this.initialize(name, StateType.SYNC);
    }

    public State(String name, StateType type){
        this.initialize(name, type);
    }

    private void initialize(String name, StateType type){
        this.name = name;
        this.type = type;
        this.transitions = new TreeMap<String, State>();
        this.errors = new TreeMap<String, State>();
        this.properties = new LinkedHashMap<String, Property>();
        this.enumerations = new TreeMap<String, Enumeration>();
        this.enqueues = new TreeMap<String, State>();
        this.annotations = new ArrayList<>();
    }

    public StateInstance buildInstance(Map<String, Object> properties){
        return new StateInstance(this, properties);
    }

    public String getName(){
        return this.name;
    }

    public void setTransitions(TreeMap<String, State> transitions){
        this.transitions = transitions;
    }

    public Map<String, State> getTransitions(){
        return this.transitions;
    }

    public void setEnqueues(TreeMap<String, State> transitions){
        this.enqueues = transitions;
    }

    public Map<String, State> getEnqueues(){
        return this.enqueues;
    }

    public void setErrors(TreeMap<String, State> errors){
        this.errors = errors;
    }

    public Map<String, State> getErrors(){
        return this.errors;
    }

    public void setProperties(LinkedHashMap<String, Property> properties){
        this.properties = properties;
    }

    public LinkedHashMap<String, Property> getProperties(){
        return this.properties;
    }

    public Collection<Property> getOrderedProperties() { return this.properties.values(); }

    public void setEnumerations(TreeMap<String, Enumeration> enumerations){
        this.enumerations = enumerations;
    }

    public Map<String, Enumeration> getEnumerations(){
        return this.enumerations;
    }

    public StateType getType(){
        return this.type;
    }

    public boolean isSync(){
        return this.type == StateType.SYNC;
    }

    public boolean isStart(){
        return this.type == StateType.START;
    }

    public boolean isStop(){
        return this.type == StateType.STOP;
    }

    public boolean isQueue(){
        return this.type == StateType.QUEUE;
    }

    public boolean hasReturnType() {
        return this.returnType != null;
    }

    public void setReturn(Property.PropertyType type, State state, boolean collection){
        this.returnType = type;
        this.returnState = state;
        this.returnCollection = collection;
    }

    public Property.PropertyType getReturnType(){
        return this.returnType;
    }

    public boolean isReturnCollection(){
        return this.returnCollection;
    }

    public State getReturnState(){
        return this.returnState;
    }

    public void addAnnotation(Annotation annotation) throws StopValidationException{
        if (annotation instanceof StateAnnotation) {
            StateAnnotation stateAnnotation = (StateAnnotation) annotation;
            for (Map.Entry<String, Property> propertyEntry : stateAnnotation.getState().getProperties().entrySet()) {
                Property p = propertyEntry.getValue();
                if (p != null) {
                    Property thisProperty = this.properties.get(propertyEntry.getKey());
                    if (thisProperty != null) {
                        if (!thisProperty.canInherit(p)) {
                            throw new StopValidationException("Inherited property " + p.getName() + " is not identical to property within " + this.getName());
                        }
                    } else {
                        throw new StopValidationException("Inherited property " + p.getName() + " not found within " + this.getName());
                    }
                }
            }
        }
        this.annotations.add(annotation);
    }

    public Collection<Annotation> getAnnotations(){
        return this.annotations;
    }

    public Collection<State> getInheritedStates(){
        Collection<State> states = new ArrayList<>();
        for (Annotation annotation : annotations){
            if (annotation instanceof  StateAnnotation){
                StateAnnotation stateAnnotation = (StateAnnotation) annotation;
                states.add(stateAnnotation.getState());
            }
        }

        return states;
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof State){
            State otherState = (State)o;
            return otherState.getName().equalsIgnoreCase(getName()) && otherState.getType().equals(getType());
        }
        return false;
    }
}
