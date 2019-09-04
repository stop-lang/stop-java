package org.stop_lang.stop.tests.models;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.stop_lang.stop.Stop;
import org.stop_lang.stop.models.*;
import org.stop_lang.stop.validation.StopValidationException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StateInstanceTest {
    @Test
    public void instance() throws Exception {
        CharStream input = CharStreams.fromFileName("./examples/hello-world.stop");
        Stop stop = new Stop(input);
        State helloState = stop.getStates().get("Hello");
        Map<String, Object> props = new HashMap<String, Object>();
        props.put("whom", "test");
        StateInstance helloStateInstance = new StateInstance(helloState, props);
        Assertions.assertEquals(helloStateInstance.getProperty("whom"), "test");
    }

    @Test
    public void validation() throws Exception {
        CharStream input = CharStreams.fromFileName("./examples/instance.stop");
        Stop stop = new Stop(input);

        State aState = stop.getStates().get("A");

        try {
            StateInstance badInstance1 = new StateInstance(aState, new HashMap<>());
            badInstance1.validateProperties();
            Assertions.fail();
        }catch(StopValidationException validationException){
            // Good
        }

        try {
            Map<String, Object> props2 = new HashMap<>();
            props2.put("collection", "test");
            StateInstance badInstance2 = new StateInstance(aState, props2);
            badInstance2.validateProperties();
            Assertions.fail();
        }catch(StopValidationException validationException){
            // Good
        }

        try {
            Enumeration type = aState.getEnumerations().get("Type");
            EnumerationInstance typeInstance = new EnumerationInstance(type, "ONE");
            Map<String, Object> props3 = new HashMap<>();
            props3.put("type", typeInstance);
            props3.put("name", null);
            props3.put("collection", new ArrayList<>());
            StateInstance badInstance3 = new StateInstance(aState, props3);
            badInstance3.validateProperties();
            Assertions.fail();
        }catch(StopValidationException validationException){
            // Good
        }

        try {
            Map<String, Object> props4 = new HashMap<>();
            props4.put("type", true);
            props4.put("name", "test");
            props4.put("collection", new ArrayList<>());
            StateInstance badInstance4 = new StateInstance(aState, props4);
            badInstance4.validateProperties();
            Assertions.fail();
        }catch(StopValidationException validationException){
            // Good
        }

        try {
            Map<String, Object> props5 = new HashMap<>();
            Enumeration type = aState.getEnumerations().get("Type");
            EnumerationInstance typeInstance = new EnumerationInstance(type, "ONE");
            props5.put("type", typeInstance);
            props5.put("name", "test");
            List<Object> values5 = new ArrayList<>();
            values5.add(new Double(23.0d));
            props5.put("collection", values5);
            StateInstance badInstance5 = new StateInstance(aState, props5);
            badInstance5.validateProperties();
            Assertions.fail();
        }catch(StopValidationException validationException){
            // Good
        }

        try {
            Map<String, Object> props6 = new HashMap<>();
            Enumeration type = aState.getEnumerations().get("Type");
            EnumerationInstance typeInstance = new EnumerationInstance(type, "ONE");
            props6.put("type", typeInstance);
            props6.put("name", "test");
            List<Object> values6 = new ArrayList<>();
            values6.add("test");
            props6.put("collection", values6);
            props6.put("circle", new StateInstance(stop.getStates().get("Square"), new HashMap<>()));
            StateInstance badInstance6 = new StateInstance(aState, props6);
            badInstance6.validateProperties();
            Assertions.fail();
        }catch(StopValidationException validationException){
            // Good
        }

        try {
            Map<String, Object> props7 = new HashMap<>();
            EnumerationInstance statusInstance = new EnumerationInstance(aState.getEnumerations().get("Status"), "DRAFT");
            props7.put("type", statusInstance);
            props7.put("name", "test");
            List<Object> values7 = new ArrayList<>();
            values7.add("test");
            props7.put("collection", values7);
            StateInstance badInstance7 = new StateInstance(aState, props7);
            badInstance7.validateProperties();
            Assertions.fail();
        }catch(StopValidationException validationException){
            // Good
        }

        try {
            Map<String, Object> props8 = new HashMap<>();
            EnumerationInstance statusInstance = new EnumerationInstance(aState.getEnumerations().get("Status"), "DRAFT");
            List<EnumerationInstance> statusInstances = new ArrayList<EnumerationInstance>();
            statusInstances.add(statusInstance);
            props8.put("types", statusInstances);
            Enumeration type = aState.getEnumerations().get("Type");
            EnumerationInstance typeInstance = new EnumerationInstance(type, "ONE");
            props8.put("type", typeInstance);
            props8.put("name", "test");
            List<Object> values8 = new ArrayList<>();
            values8.add("test");
            props8.put("collection", values8);
            StateInstance badInstance8 = new StateInstance(aState, props8);
            badInstance8.validateProperties();
            Assertions.fail();
        }catch(StopValidationException validationException){
            // Good
        }
    }
}
