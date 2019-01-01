package main.java.problem8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
@RunWith(JUnit4.class)
public class GuessNumberTest {
    private static final String INPUT = "25";
    private GuessNumber guessNumber = new GuessNumber();
    private ByteArrayInputStream inputStream = new ByteArrayInputStream(INPUT.getBytes());
    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setIn(inputStream);
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDown() {
        System.setOut(System.out);
    }

    @Test
    public void testForGuessing() throws IOException {
        guessNumber.guessNumber();
        assertEquals("Number guessed matches the original number\n", outputStream.toString());
    }
}