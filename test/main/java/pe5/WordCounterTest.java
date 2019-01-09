package main.java.pe5;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class WordCounterTest {
    private WordCounter wordCounter;

    @Before
    public void setUp() {
        wordCounter = new WordCounter();
    }

    @Test
    public void testForCountOfOccurancesSuccess() {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("one", 5);
        stringIntegerMap.put("two", 2);
        stringIntegerMap.put("three", 2);
        assertEquals(stringIntegerMap, wordCounter.countOfWords());
    }
}