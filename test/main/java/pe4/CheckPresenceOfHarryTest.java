package main.java.pe4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckPresenceOfHarryTest {
    private CheckPresenceOfHarry checkPresenceOfHarry;

    @Before
    public void setUp() {
        checkPresenceOfHarry = new CheckPresenceOfHarry();
    }

    @Test
    public void testForPresenceHarrySucess() {
        assertTrue(checkPresenceOfHarry.checkIfHarryIsPresent("Good game Harry"));
    }

    @Test
    public void testForPresenceHarryForNullSentence() {
        assertFalse(checkPresenceOfHarry.checkIfHarryIsPresent(null));
    }

    @Test
    public void testForPresenceHarryFailure() {
        assertFalse(checkPresenceOfHarry.checkIfHarryIsPresent("Not a good game"));
    }
}