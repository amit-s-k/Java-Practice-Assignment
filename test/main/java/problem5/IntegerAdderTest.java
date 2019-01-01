package main.java.problem5;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class IntegerAdderTest {
    private String INPUT = "2 3 4.0";
    private ByteArrayInputStream inputStream = new ByteArrayInputStream(INPUT.getBytes());

    @Before
    public void setUp() {
        System.setIn(inputStream);
    }

    @Test
    public void testForAddingIntegers() {
        IntegerAdder integerAdder = new IntegerAdder();
        assertEquals(5, integerAdder.addIntegers());
    }
}