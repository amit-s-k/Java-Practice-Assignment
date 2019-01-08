package main.java.pe4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceAllDAndLTest {
    private ReplaceAllDAndL replaceAllDAndL;

    @Before
    public void setUp() {
        replaceAllDAndL = new ReplaceAllDAndL();
    }

    @Test
    public void testForReplacingDAndLSuccess() {
        assertEquals("faity fry", replaceAllDAndL.replaceAllDAndL("daily dry"));
    }

    @Test
    public void testForReplacingDAndLFailure() {
        assertEquals("katherine", replaceAllDAndL.replaceAllDAndL("katherine"));
    }

    @Test
    public void testForReplacingDAndLForNullInput() {
        assertEquals("", replaceAllDAndL.replaceAllDAndL(""));
    }
}