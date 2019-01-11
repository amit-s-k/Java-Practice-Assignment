package com.stackroute.main.java.pe1.problem1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class PalindromeCheckerTest {
    private static final Long PALINDROME_NUMBER = 23432L;
    private static final Long NON_PALINDROME_NUMBER = 2343L;
    private PalindromeChecker palindromeChecker;

    @Before
    public void setUp() {
        palindromeChecker = new PalindromeChecker();
    }

    @Test
    public void testForPalindromeNumber() {
        assertTrue(palindromeChecker.isNumberPalindrome(PALINDROME_NUMBER));
    }

    @Test
    public void testForNonPalindromeNumber() {
        assertFalse(palindromeChecker.isNumberPalindrome(NON_PALINDROME_NUMBER));
    }
}