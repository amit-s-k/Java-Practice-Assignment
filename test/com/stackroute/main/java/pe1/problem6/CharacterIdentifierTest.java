package com.stackroute.main.java.pe1.problem6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class CharacterIdentifierTest {
    private static final String CAPITAL = "A";
    private static final String LOWERCASE = "a";
    private static final String DIGIT = "7";
    private static final String SPECIAL_SYMBOL = "$";
    private CharacterIdentifier identifier;
    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        identifier = new CharacterIdentifier();
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDown() {
        System.setOut(System.out);
    }

    @Test
    public void testForCapitalLetter() {
        identifier.identifyCharacter(CAPITAL);
        assertEquals("Capital Letter\n", outputStream.toString());
    }

    @Test
    public void testForSmallCaseLetter() {
        identifier.identifyCharacter(LOWERCASE);
        assertEquals("Small Case Letter\n", outputStream.toString());
    }

    @Test
    public void testForSpecialSymbol() {
        identifier.identifyCharacter(SPECIAL_SYMBOL);
        assertEquals("Special Symbol\n", outputStream.toString());
    }

    @Test
    public void testForDigit() {
        identifier.identifyCharacter(DIGIT);
        assertEquals("Digit\n", outputStream.toString());
    }
}