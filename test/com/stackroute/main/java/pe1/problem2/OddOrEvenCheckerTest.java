package com.stackroute.main.java.pe1.problem2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class OddOrEvenCheckerTest {
    private static final int EVEN_NUMBER = 18;
    private static final int ODD_NUMBER = 17;
    private OddOrEvenChecker oddOrEvenChecker;

    @Before
    public void setUp() {
        oddOrEvenChecker = new OddOrEvenChecker();
    }

    @Test
    public void testForOddNumber() {
        assertFalse(oddOrEvenChecker.isNumberEven(ODD_NUMBER));
    }

    @Test
    public void testForEvenNumber() {
        assertTrue(oddOrEvenChecker.isNumberEven(EVEN_NUMBER));
    }
}