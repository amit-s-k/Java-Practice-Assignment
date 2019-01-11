package com.stackroute.main.java.pe3;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class FirstAndLastDateOfWeekTest {
    private FirstAndLastDateOfWeek firstAndLastDateOfWeek;

    @Before
    public void setUp() {
        firstAndLastDateOfWeek = new FirstAndLastDateOfWeek();
    }

    @Test
    public void testForFirstDayOfWeek() {
        assertEquals("15 / 1 / 2019", firstAndLastDateOfWeek.getFirstDayOfWeek(3, 1, 2019));
    }

    @Test
    public void testForLastDayOfWeek() {
        assertEquals("21 / 1 / 2019", firstAndLastDateOfWeek.getLastDayOfWeek(3, 1, 2019));
    }
}