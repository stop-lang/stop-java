package org.stop_lang.stop.models;

import java.util.HashMap;

public class StatePropertyValidation extends PropertyValidation{
    private State state;
    private boolean inheritable;

    public StatePropertyValidation(State state, boolean inheritable) {
        super("state", new HashMap<>());
        this.state = state;
        this.inheritable = inheritable;
    }

    public State getState(){
        return state;
    }

    public boolean isInheritable(){
        return inheritable;
    }
}
