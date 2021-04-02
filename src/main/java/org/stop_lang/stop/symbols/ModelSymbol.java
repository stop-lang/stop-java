package org.stop_lang.stop.symbols;

import org.antlr.symtab.Scope;
import org.antlr.symtab.SymbolWithScope;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stop_lang.stop.models.Annotation;
import org.stop_lang.stop.parser.StopParser;

import java.util.*;

public class ModelSymbol extends SymbolWithScope {
    private boolean stop =false;
    private boolean start =false;
    private boolean queue = false;
    private Map<StopParser.Throw_parameterContext, ThrowSymbol> errors = new HashMap<>();
    private Map<StopParser.TransitionContext, TransitionSymbol> transitions = new HashMap<>();
    private Map<StopParser.EnqueueContext, EnqueueSymbol> enqueues = new HashMap<>();
    private ReturnSymbol returnSymbol = null;
    private String fullName;
    private String packageName;
    private List<StopParser.AnnotationContext> annotations = new ArrayList<>();

    public ModelSymbol(StopParser.ModelContext ctx, Scope enclosingScope, String defaultPackageName){
        super(ctx.MODEL_TYPE().getText());
        setScope(enclosingScope);
        if(ctx.STOP() != null) {
            stop = true;
        } else if (ctx.START() != null){
            start = true;
        } else if (ctx.QUEUE() != null){
            queue = true;
        }

        String name = ctx.MODEL_TYPE().getText();
        packageName = defaultPackageName;

        ParseTree p = ctx.getParent().getChild(0);
        if (p!=null && (p instanceof StopParser.PackageDeclarationContext)){
            StopParser.PackageDeclarationContext decl = (StopParser.PackageDeclarationContext)p;
            packageName = decl.packageName().getText();
        }

        if (packageName!=null){
            name = packageName + "." + name;
        }

        if (ctx.return_type()!=null){
            returnSymbol = new ReturnSymbol(ctx, enclosingScope, packageName);
        }

        fullName = name;

        this.annotations.addAll(ctx.annotation());
    }

    @Override
    public String getName(){
        return fullName;
    }

    public boolean isStop(){
        return stop;
    }
    public boolean isStart(){
        return start;
    }
    public boolean isQueue(){
        return queue;
    }

    public ReturnSymbol getReturn(){
        return returnSymbol;
    }

    public Collection<ThrowSymbol> getErrors(){
        return errors.values();
    }

    public void addError(ThrowSymbol throwSymbol){
        errors.put(throwSymbol.getContext(), throwSymbol);
    }

    public ThrowSymbol getError(StopParser.Throw_parameterContext ctx){
        return errors.get(ctx);
    }

    public void addTransition(TransitionSymbol transition)
    {
        transitions.put(transition.getContext(), transition);
    }

    public TransitionSymbol getTransition(StopParser.TransitionContext ctx){
        return transitions.get(ctx);
    }

    public Collection<TransitionSymbol> getTransitions(){
        return transitions.values();
    }

    public void addEnqueue(EnqueueSymbol enqueueSymbol){
        enqueues.put(enqueueSymbol.getContext(), enqueueSymbol);
    }

    public EnqueueSymbol getEnqueue(StopParser.EnqueueContext ctx){
        return enqueues.get(ctx);
    }

    public Collection<EnqueueSymbol> getEnqueues(){
        return enqueues.values();
    }

    public Map<String, Map<String, String>> getModelAnnotations(){
        Map<String, Map<String, String>> modelAnnotations = new HashMap<>();
        for (StopParser.AnnotationContext annotationContext : annotations){
            if (annotationContext.annotation_type().model_type()!=null){
                String annotationName = annotationContext.annotation_type().model_type().getText();
                if (!annotationName.contains(".") && (packageName!=null)){
                    annotationName = packageName + "." + annotationName;
                }
                Map<String, String> params = new HashMap<>();
                if (annotationContext.annotation_parameters()!=null){
                    for (StopParser.Annotation_parameterContext param : annotationContext.annotation_parameters().annotation_parameter()){
                        params.put(param.ID().getText(), param.annotation_parameter_value().STRING().getText().replaceAll("\"", ""));
                    }
                }
                modelAnnotations.put(annotationName, params);
            }
        }
        return modelAnnotations;
    }

    public Collection<Annotation> getAnnotations(){
        Collection<Annotation> annotationObjects = new ArrayList<>();
        for (StopParser.AnnotationContext annotationContext : annotations){
            if (annotationContext.annotation_type().reference()!=null){
                String annotationName = annotationContext.annotation_type().reference().getText();
                Map<String, String> annotationParameters = new HashMap<>();

                if (annotationContext.annotation_parameters()!=null){
                    for (StopParser.Annotation_parameterContext param : annotationContext.annotation_parameters().annotation_parameter()){
                        annotationParameters.put(param.ID().getText(), param.annotation_parameter_value().STRING().getText().replaceAll("\"", ""));
                    }
                }

                Annotation annotation = new Annotation(annotationName, annotationParameters);
                annotationObjects.add(annotation);
            }
        }
        return annotationObjects;
    }
}
