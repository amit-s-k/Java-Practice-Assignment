package main.java.problem1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(JUnit4.class)
public class DigitAdderTest {
    private static final long ACTUAL_NUMBER = 12345L;
    private DigitAdder digitAdder;

    @Before
    public void setUp() {
        digitAdder = new DigitAdder();
    }

    @Test
    public void testForAddingDigitsCorrectly() {
        Long expectedSum = 6L;
        assertEquals(expectedSum, digitAdder.addDigits(ACTUAL_NUMBER));
    }

    @Test
    public void testForAddingDigitsIncorrectly() {
        Long expectedSum = 5L;
        assertNotEquals(expectedSum, digitAdder.addDigits(ACTUAL_NUMBER));
    }
}