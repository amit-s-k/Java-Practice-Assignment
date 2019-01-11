package com.stackroute.main.java.pe2.problem5;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class EvenNumTest {
    private EvenOrOdd evenOrOdd;

    @Before
    public void setUp() {
        evenOrOdd = new EvenOrOdd();
    }

    @Test
    public void testForOddNumber() {
        assertFalse(evenOrOdd.isEven(21));
    }

    @Test
    public void testForEvenNumber() {
        assertTrue(evenOrOdd.isEven(2));
    }
}
