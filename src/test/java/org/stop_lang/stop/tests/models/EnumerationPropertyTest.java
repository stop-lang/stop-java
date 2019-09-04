package org.stop_lang.stop.tests.models;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.stop_lang.stop.Stop;
import org.stop_lang.stop.models.*;

public class EnumerationPropertyTest {
    @Test
    public void property() throws Exception{
        CharStream input = CharStreams.fromFileName("./examples/kitchen-sink.stop");
        Stop stop = new Stop(input);
        State requestState = stop.getStates().get("kitchen.sink.Request");
        Enumeration enumeration = requestState.getEnumerations().get("Method");
        EnumerationProperty enumerationProperty = (EnumerationProperty)requestState.getProperties().get("method");
        Assertions.assertEquals(enumeration, enumerationProperty.getEnumeration());
        Assertions.assertEquals(enumerationProperty.getClassType(), EnumerationInstance.class);
    }
}
