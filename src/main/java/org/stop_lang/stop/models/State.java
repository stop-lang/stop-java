package org.stop_lang.stop.models;

import java.util.Map;
import java.util.TreeMap;

public class State {
    public enum StateType {
        SYNC,
        ASYNC,
        START,
        STOP,
        QUEUE
    }

    protected String name;
    protected Map<String, State> transitions;
    protected Map<String, State> errors;
    protected Map<String, Property> properties;
    protected Map<String, Enumeration> enumerations;
    protected Map<String, State> enqueues;
    protected StateType type;
    protected Property.PropertyType returnType = null;
    protected State returnState = null;
    protected boolean returnCollection = false;

    public State(String name){
        this.name = name;
        this.transitions = new TreeMap<String, State>();
        this.errors = new TreeMap<String, State>();
        this.properties = new TreeMap<String, Property>();
        this.enumerations = new TreeMap<String, Enumeration>();
        this.enqueues = new TreeMap<String, State>();
        this.type = StateType.SYNC;
    }

    public State(String name, StateType type){
        this.name = name;
        this.type = type;
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

    public void setProperties(TreeMap<String, Property> properties){
        this.properties = properties;
    }

    public Map<String, Property> getProperties(){
        return this.properties;
    }

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

    public boolean isAsync(){
        return this.type == StateType.ASYNC;
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

    @Override
    public boolean equals(Object o){
        if (o instanceof State){
            State otherState = (State)o;
            return otherState.getName().equalsIgnoreCase(getName()) && otherState.getType().equals(getType());
        }
        return false;
    }
}
