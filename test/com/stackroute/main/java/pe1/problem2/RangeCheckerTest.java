package com.stackroute.main.java.pe1.problem2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class RangeCheckerTest {
    private static final int IN_RANGE = 25;
    private static final int NOT_IN_RANGE = 19;
    private RangeChecker rangeChecker;

    @Before
    public void setUp() {
        rangeChecker = new RangeChecker();
    }

    @Test
    public void testForNumberInRange() {
        assertTrue(rangeChecker.isNumberBetweenTwentyAndThirty(IN_RANGE));
    }

    @Test
    public void testForNumberNotInRange() {
        assertFalse(rangeChecker.isNumberBetweenTwentyAndThirty(NOT_IN_RANGE));
    }
}