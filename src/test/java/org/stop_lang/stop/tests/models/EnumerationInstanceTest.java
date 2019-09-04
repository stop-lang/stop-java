package org.stop_lang.stop.tests.models;

import org.junit.jupiter.api.Assertions;
import org.stop_lang.stop.models.Enumeration;
import org.stop_lang.stop.models.EnumerationInstance;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class EnumerationInstanceTest {
    @Test
    public void model(){
        List<String> values = new ArrayList<>();
        values.add("DRAFT");
        values.add("PUBLISHED");
        Enumeration enumeration = new Enumeration("name", values);

        try {
            EnumerationInstance enumerationInstance = new EnumerationInstance(enumeration, "PUBLISHED");
            Assertions.assertNotNull(enumerationInstance);
            Assertions.assertTrue(enumerationInstance.getEnumeration().equals(enumeration));
            Assertions.assertTrue(enumerationInstance.getValue().equals("PUBLISHED"));
        }catch(Exception e){
            Assertions.fail();
        }

        try {
            new EnumerationInstance(enumeration, "INVALID");
            Assertions.fail();
        }catch(Exception e){
            // Success
        }
    }
}
