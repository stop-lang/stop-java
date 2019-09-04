package org.stop_lang.stop.tests.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.stop_lang.stop.models.Property;

import java.nio.ByteBuffer;
import java.time.Instant;

public class PropertyTest {
    @Test
    public void getClassForScalarPropertyType(){
        Assertions.assertEquals(Property.getClassForScalarPropertyType(Property.PropertyType.DOUBLE), Double.class);
        Assertions.assertEquals(Property.getClassForScalarPropertyType(Property.PropertyType.FLOAT), Float.class);
        Assertions.assertEquals(Property.getClassForScalarPropertyType(Property.PropertyType.INT32), Integer.class);
        Assertions.assertEquals(Property.getClassForScalarPropertyType(Property.PropertyType.INT64), Long.class);
        Assertions.assertEquals(Property.getClassForScalarPropertyType(Property.PropertyType.UINT32), Integer.class);
        Assertions.assertEquals(Property.getClassForScalarPropertyType(Property.PropertyType.UINT64), Long.class);
        Assertions.assertEquals(Property.getClassForScalarPropertyType(Property.PropertyType.SINT32), Integer.class);
        Assertions.assertEquals(Property.getClassForScalarPropertyType(Property.PropertyType.SINT64), Long.class);
        Assertions.assertEquals(Property.getClassForScalarPropertyType(Property.PropertyType.FIXED32), Integer.class);
        Assertions.assertEquals(Property.getClassForScalarPropertyType(Property.PropertyType.FIXED64), Long.class);
        Assertions.assertEquals(Property.getClassForScalarPropertyType(Property.PropertyType.SFIXED32), Integer.class);
        Assertions.assertEquals(Property.getClassForScalarPropertyType(Property.PropertyType.SFIXED64), Long.class);
        Assertions.assertEquals(Property.getClassForScalarPropertyType(Property.PropertyType.BOOL), Boolean.class);
        Assertions.assertEquals(Property.getClassForScalarPropertyType(Property.PropertyType.STRING), String.class);
        Assertions.assertEquals(Property.getClassForScalarPropertyType(Property.PropertyType.TIMESTAMP), Instant.class);
        Assertions.assertEquals(Property.getClassForScalarPropertyType(Property.PropertyType.BYTES), ByteBuffer.class);
        try {
            Property.getClassForScalarPropertyType(Property.PropertyType.STATE);
            Assertions.fail();
        }catch(IllegalArgumentException e){
            // Good
        }
    }

    @Test
    public void getPropertyType(){
        Assertions.assertEquals(Property.getPropertyType("double"), Property.PropertyType.DOUBLE);
        Assertions.assertEquals(Property.getPropertyType("float"), Property.PropertyType.FLOAT);
        Assertions.assertEquals(Property.getPropertyType("int32"), Property.PropertyType.INT32);
        Assertions.assertEquals(Property.getPropertyType("int64"), Property.PropertyType.INT64);
        Assertions.assertEquals(Property.getPropertyType("uint32"), Property.PropertyType.UINT32);
        Assertions.assertEquals(Property.getPropertyType("uint64"), Property.PropertyType.UINT64);
        Assertions.assertEquals(Property.getPropertyType("sint32"), Property.PropertyType.SINT32);
        Assertions.assertEquals(Property.getPropertyType("sint64"), Property.PropertyType.SINT64);
        Assertions.assertEquals(Property.getPropertyType("fixed32"), Property.PropertyType.FIXED32);
        Assertions.assertEquals(Property.getPropertyType("fixed64"), Property.PropertyType.FIXED64);
        Assertions.assertEquals(Property.getPropertyType("sfixed32"), Property.PropertyType.SFIXED32);
        Assertions.assertEquals(Property.getPropertyType("sfixed64"), Property.PropertyType.SFIXED64);
        Assertions.assertEquals(Property.getPropertyType("bool"), Property.PropertyType.BOOL);
        Assertions.assertEquals(Property.getPropertyType("string"), Property.PropertyType.STRING);
        Assertions.assertEquals(Property.getPropertyType("timestamp"), Property.PropertyType.TIMESTAMP);
        Assertions.assertEquals(Property.getPropertyType("bytes"), Property.PropertyType.BYTES);
        Assertions.assertEquals(Property.getPropertyType("Test"), Property.PropertyType.STATE);
    }
}
