package com.stackroute.main.java.pe4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortStringsAlphabeticallyTest {
    private SortStringsAlphabetically sortStringsAlphabetically;

    @Before
    public void setUp() {
        sortStringsAlphabetically = new SortStringsAlphabetically();
    }

    @Test
    public void testForSortingAlphabeticallySucuess() {
        assertEquals("Anymore Don't Talk We", sortStringsAlphabetically.sortAlphabetically("We Don't Talk Anymore"));
    }

    @Test
    public void testForSortingAlphabeticallyNullInput() {
        assertEquals("", sortStringsAlphabetically.sortAlphabetically(null));
    }
}