package com.stackroute.main.java.pe2.problem2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class PowerOf4Test {
    private PowerOf4 powerOf4;

    @Before
    public void setUp() {
        powerOf4 = new PowerOf4();
    }

    @Test
    public void testForNumberWhichIsAPowerOf4() {
        assertTrue(powerOf4.isPowerOfFour("64"));
    }

    @Test
    public void testForNumberWhichIsNotAPowerOf4() {
        assertFalse(powerOf4.isPowerOfFour("12"));
    }
}
