package main.java.pe3;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ConsecutiveSeriesTest {
    private static final List<Long> CONSECUTIVE_SERIES = Arrays.asList(2020L, 2019L, 2021L, 2022L);
    private static final List<Long> REPEATED_SERIES = Arrays.asList(2020L, 2019L, 2021L, 2021L);
    private static final List<Long> NON_CONSECUTIVE_SERIES = Arrays.asList(2019L, 2020L, 2021L, 2023L);
    private ConsecutiveSeries consecutiveSeries;

    @Before
    public void setUp() {
        consecutiveSeries = new ConsecutiveSeries();
    }

    @Test
    public void testForConsecutiveSeriesSuccess() {
        assertTrue(consecutiveSeries.isSeriesConsecutive(CONSECUTIVE_SERIES));
    }

    @Test
    public void testForNonConsecutiveSeries() {
        assertFalse(consecutiveSeries.isSeriesConsecutive(NON_CONSECUTIVE_SERIES));
    }
    @Test
    public void testForSeriesWithRepeatedNumbers() {
        assertFalse(consecutiveSeries.isSeriesConsecutive(REPEATED_SERIES));
    }

    @Test
    public void testForConsecutiveSeriesForInvalidInput() {
        assertFalse(consecutiveSeries.isSeriesConsecutive(null));
    }
}