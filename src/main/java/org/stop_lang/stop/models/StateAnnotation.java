package org.stop_lang.stop.models;

import java.util.Map;

public class StateAnnotation extends Annotation{
    private State state;

    public StateAnnotation(State state, Map<String, String> parameters){
        super(state.getName(), parameters);
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
