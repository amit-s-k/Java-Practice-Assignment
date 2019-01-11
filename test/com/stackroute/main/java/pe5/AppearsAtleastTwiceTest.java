package com.stackroute.main.java.pe5;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class AppearsAtleastTwiceTest {
    private AppearsAtleastTwice appearsAtleastTwice;

    @Before
    public void setUp() {
        appearsAtleastTwice = new AppearsAtleastTwice();
    }

    @Test
    public void testForAppearingAtleastTwice() {
        Map<String, Boolean> stringBooleanMap = new HashMap<>();
        stringBooleanMap.put("a", true);
        stringBooleanMap.put("b", false);
        stringBooleanMap.put("c", true);
        assertEquals(stringBooleanMap, appearsAtleastTwice.getCountOfWords(new String[]{"a", "b", "c", "a", "c"}));
    }
}