package org.stop_lang.stop.models;

import java.util.Map;

public class PropertyValidation {
    private String name;
    private Map<String, Object> parameters;

    public PropertyValidation(String name, Map<String, Object> parameters){
        this.name = name;
        this.parameters = parameters;
    }

    public String getName(){
        return this.name;
    }

    public Map<String, Object> getParameters(){
        return this.parameters;
    }
}
