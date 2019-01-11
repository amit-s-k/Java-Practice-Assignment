package com.stackroute.main.java.pe4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransposeOfStringTest {
    private TransposeOfString transposeOfString;

    @Before
    public void setUp() {
        transposeOfString = new TransposeOfString();
    }

    @Test
    public void testForTransposeSuccess() {
        assertEquals("llup em resolc", transposeOfString.getTransposeOfString("pull me closer"));
    }
}