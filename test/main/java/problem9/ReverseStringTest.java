package main.java.problem9;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
@RunWith(JUnit4.class)
public class ReverseStringTest {
    private static final String INPUT = "Katherine";
    private ReverseString reverseString = new ReverseString();

    @Test
    public void testForStringReverse() {
        assertEquals("enirehtaK", reverseString.reverseString(INPUT));
    }
}