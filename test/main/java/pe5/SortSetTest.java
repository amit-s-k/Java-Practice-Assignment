package main.java.pe5;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class SortSetTest {
    @Test
    public void testForSortingSet() {
        SortSet sortSet = new SortSet();
        Set<String> unorderedSetOfNames = new HashSet<>();
        unorderedSetOfNames.add("katherine");
        unorderedSetOfNames.add("ellie");
        assertEquals(Arrays.asList("ellie", "katherine"), sortSet.getSetToSortedList(unorderedSetOfNames));
    }
}