package org.stop_lang.stop.models;

import java.util.ArrayList;

public class EnumerationProperty extends Property {
    protected Enumeration enumeration;

    public EnumerationProperty(String name, Enumeration enumeration, boolean collection, State provider, boolean optional){
        super(name, PropertyType.ENUM, collection, provider, false, optional, new ArrayList<>());
        this.enumeration = enumeration;
    }

    public Enumeration getEnumeration(){
        return this.enumeration;
    }

    @Override
    protected Class getClassForPropertyType(Property.PropertyType propertyType){
        return EnumerationInstance.class;
    }
}

