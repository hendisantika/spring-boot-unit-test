package com.example.util;

import com.example.model.ToDo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PayloadValidatorTest {

    @Test
    public void validatePayLoad() {
        ToDo toDo = new ToDo(1, "Sample ToDo 1", true);
        assertEquals(false, PayloadValidator.validateCreatePayload(toDo));
    }

    @Test
    public void validateInvalidPayLoad() {
        ToDo toDo = new ToDo(0, "Sample ToDo 1", true);
        assertEquals(true, PayloadValidator.validateCreatePayload(toDo));
    }


}
