package main.java.pe5;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class UpdateListTest {
    private UpdateList updateList;

    @Before
    public void setUp() {
        updateList = new UpdateList();
    }

    @Test
    public void testForUpdatingListSuccess() {
        assertEquals(Arrays.asList("taylor", "katherine"), updateList.updateList(Arrays.asList("taylor", "justin"), "justin", "katherine"));
    }

    @Test
    public void testForUpdatingListFailure() {
        assertEquals(Collections.emptyList(), updateList.updateList(Arrays.asList("taylor", "selena"), "justin", "katherine"));
    }

    @Test(expected = NullPointerException.class)
    public void testForNullList() {
        assertEquals(Collections.emptyList(), updateList.updateList(null, "justin", "katherine"));
    }
}