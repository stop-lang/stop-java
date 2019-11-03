package org.stop_lang.stop.tests.parser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.stop_lang.stop.Stop;
import org.stop_lang.stop.models.Property;
import org.stop_lang.stop.models.State;
import org.stop_lang.stop.validation.IncludePhase;
import org.stop_lang.stop.validation.StopValidationException;

import java.util.List;

public class ParserTest {

    @Test
    public void parserTest() throws Exception {
        new Stop("./examples/hello-world.stop");
        new Stop("./examples/kitchen-sink.stop");
        new Stop("./examples/types.stop");
        new Stop("./examples/references.stop");
        Stop enumStop = new Stop("./examples/enum.stop");
        State getStatus = enumStop.getStates().get("sandbox.GetStatus");
        Property property = getStatus.getProperties().get("status");
        Assertions.assertNotNull(property);
    }

    @Test
    void errorsTest() throws Exception{
        Assertions.assertThrows(StopValidationException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new Stop("./examples/errors/validation-error.stop");
            }
        });
        Assertions.assertThrows(StopValidationException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new Stop("./examples/errors/include.stop");
            }
        });
        Assertions.assertThrows(StopValidationException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new Stop("./examples/errors/refs.stop");
            }
        });
    }

    @Test
    public void includeTest(){
        List<String> paths = IncludePhase.getIncludePaths();
        Assertions.assertTrue(!paths.isEmpty());
    }
}
