package com.stackroute.main.java.pe3;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RemoveLowerCaseVowelsTest {
    private static final List<String> VALID = Arrays.asList("Selena", "Katherine", "Utopia");

    @Test
    public void testForRemovingLowerCaseVowels() {
        RemoveLowerCaseVowels removeLowerCaseVowels = new RemoveLowerCaseVowels();
        assertEquals(Arrays.asList("Sln", "Kthrn", "Utp"), removeLowerCaseVowels.removeLowerCaseVowels(VALID));
    }
}