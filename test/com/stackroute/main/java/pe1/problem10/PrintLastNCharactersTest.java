package com.stackroute.main.java.pe1.problem10;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
@RunWith(JUnit4.class)
public class PrintLastNCharactersTest {
    private static final String INPUT = "Katherine";
    private PrintLastNCharacters printLastNCharacters = new PrintLastNCharacters();
    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testForPrinting() {
        printLastNCharacters.printLastNCharacters(INPUT, 2);
        assertEquals(INPUT.concat("nene\n"), outputStream.toString());
    }
}