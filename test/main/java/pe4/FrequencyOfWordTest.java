package main.java.pe4;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class FrequencyOfWordTest {
    private FrequencyOfWord frequencyOfWord;


    @Before
    public void setUp() {
        frequencyOfWord = new FrequencyOfWord();
    }

    @Test
    public void testForFrequencyOfWord() {
        Map<String, List<Integer>> indices = new HashMap<>();
        indices.put("startindex", Arrays.asList(4, 10, 27));
        indices.put("lastindex", Arrays.asList(5, 11, 28));
        assertEquals(new Index(indices).toString(), frequencyOfWord.getStartIndexAndEndIndex("She sells seashells by the seashore", "se").toString());
    }
}