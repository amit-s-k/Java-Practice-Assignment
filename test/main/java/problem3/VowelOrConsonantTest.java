package main.java.problem3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class VowelOrConsonantTest {
    private static final String VOWEL = "A";
    private static final String CONSONANT = "B";
    private static final String SPECIAL_CHARACTER = "$";
    private VowelOrConsonant vowelOrConsonant;
    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        vowelOrConsonant = new VowelOrConsonant();
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDown() {
        System.setOut(System.out);
    }

    @Test
    public void testForVowel() {
        vowelOrConsonant.isVowelOrConsonant(VOWEL);
        assertEquals("Vowel ", outputStream.toString());
    }

    @Test
    public void testForConsonant() {
        vowelOrConsonant.isVowelOrConsonant(CONSONANT);
        assertEquals("Consonant ", outputStream.toString());
    }

    @Test
    public void testForSpecialCharacter() {
        vowelOrConsonant.isVowelOrConsonant(SPECIAL_CHARACTER);
        assertEquals("Not an alphabet\n", outputStream.toString());
    }
}