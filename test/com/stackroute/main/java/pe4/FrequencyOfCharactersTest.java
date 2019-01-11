package com.stackroute.main.java.pe4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrequencyOfCharactersTest {
    private FrequencyOfCharacters frequencyOfCharacters;

    @Before
    public void setUp() {
        frequencyOfCharacters = new FrequencyOfCharacters();
    }

    @Test
    public void testForReplacingAllCharactersSuccess() {
        assertEquals(10, frequencyOfCharacters.numberOfOccurances("Java is java again java again", "a"));
    }

    @Test
    public void testForNullInput() {
        assertEquals(0, frequencyOfCharacters.numberOfOccurances(null, "a"));
    }

    @Test
    public void testForReplacingAllCharactersFailure() {
        assertEquals(0, frequencyOfCharacters.numberOfOccurances("Java is java again java again", "A"));
    }
}