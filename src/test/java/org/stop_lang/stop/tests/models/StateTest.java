package org.stop_lang.stop.tests.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.stop_lang.stop.models.Property;
import org.stop_lang.stop.models.State;

import java.util.TreeMap;

public class StateTest {
    @Test
    public void state(){
        State s = new State("Test");
        Assertions.assertFalse(s.equals(new String()));
        Assertions.assertTrue(s.isSync());
        Assertions.assertEquals(s.getType(), State.StateType.SYNC);
        Assertions.assertFalse(s.isAsync());

        Assertions.assertFalse(s.hasReturnType());

        s.setReturn(Property.PropertyType.STRING, null, false);
        Assertions.assertEquals(s.getReturnType(), Property.PropertyType.STRING);

        Assertions.assertTrue(s.hasReturnType());
        Assertions.assertFalse(s.isQueue());

        State q = new State("Queue");
        TreeMap<String, State> enqueues = new TreeMap<String, State>();
        enqueues.put("Queue", q);
        s.setEnqueues(enqueues);

        Assertions.assertEquals(s.getEnqueues().get("Queue"), q);
    }
}
