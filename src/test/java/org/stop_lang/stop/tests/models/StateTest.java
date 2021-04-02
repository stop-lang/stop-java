package org.stop_lang.stop.tests.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.stop_lang.stop.models.Property;
import org.stop_lang.stop.models.State;
import org.stop_lang.stop.models.StateTransition;

import java.util.TreeMap;

public class StateTest {
    @Test
    public void state(){
        State s = new State("Test");
        Assertions.assertFalse(s.equals(new String()));
        Assertions.assertTrue(s.isSync());
        Assertions.assertEquals(s.getType(), State.StateType.SYNC);

        Assertions.assertFalse(s.hasReturnType());

        s.setReturn(Property.PropertyType.STRING, null, false, false);
        Assertions.assertEquals(s.getReturnType(), Property.PropertyType.STRING);

        Assertions.assertTrue(s.hasReturnType());
        Assertions.assertFalse(s.isQueue());

        State q = new State("Queue");
        TreeMap<String, StateTransition> enqueues = new TreeMap<String, StateTransition>();
        enqueues.put("Queue", new StateTransition(q, false));
        s.setEnqueues(enqueues);

        Assertions.assertEquals(s.getEnqueues().get("Queue").getState(), q);
    }
}
