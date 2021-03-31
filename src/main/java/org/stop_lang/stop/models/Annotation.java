package org.stop_lang.stop.models;

import java.util.Map;

public class Annotation {
    private String name;
    private Map<String, String> parameters;

    public Annotation(String name, Map<String, String> parameters){
        this.name = name;
        this.parameters = parameters;
    }

    public String getName(){
        return this.name;
    }

    public Map<String, String> getParameters(){
        return this.parameters;
    }
}
