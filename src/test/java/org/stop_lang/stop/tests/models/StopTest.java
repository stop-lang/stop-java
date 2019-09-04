package org.stop_lang.stop.tests.models;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.stop_lang.stop.models.State;
import org.stop_lang.stop.Stop;

import java.util.Set;

public class StopTest {
    @Test
    public void stop() throws Exception{
        CharStream input = CharStreams.fromFileName("./examples/kitchen-sink.stop");
        Stop stop = new Stop(input);
        Set<State> startStates = stop.getStartStates();
        Assertions.assertTrue(startStates.size() == 1);
        Assertions.assertEquals(startStates.iterator().next().getName(), "kitchen.sink.Router");
    }
}
