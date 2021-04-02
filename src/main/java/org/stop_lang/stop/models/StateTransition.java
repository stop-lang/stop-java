package org.stop_lang.stop.models;

public class StateTransition {
    private State state;
    private boolean annotation;

    public StateTransition(State state, boolean annotation){
        this.state = state;
        this.annotation = annotation;
    }

    public State getState(){
        return this.state;
    }

    public boolean isAnnotation(){
        return annotation;
    }
}
