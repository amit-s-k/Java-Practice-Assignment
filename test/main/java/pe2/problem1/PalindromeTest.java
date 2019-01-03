package main.java.pe2.problem1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class PalindromeTest {
    private Palindrome palindrome;

    @Before
    public void setUp() {
        palindrome = new Palindrome();
    }

    @Test
    public void testForPalindromeStringInput() {
        assertTrue(palindrome.isPalindrome("nitin"));
    }

    @Test
    public void testForPalindromeNumberInput() {
        assertTrue(palindrome.isPalindrome("121"));
    }

    @Test
    public void testForNonPalindromeStringInput() {
        assertFalse(palindrome.isPalindrome("katherine"));
    }

    @Test
    public void testForNonPalindromeNumberInput() {
        assertFalse(palindrome.isPalindrome("122"));
    }
    @Test
    public void testForNullInput(){
        assertFalse(palindrome.isPalindrome(null));
    }
}
