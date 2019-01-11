package com.stackroute.main.java.pe1.problem1;

class PalindromeChecker {
    /**
     * Checks whether number is palindrome or not
     * @param number - long number
     * @return Returns true if the number is palindrome
     */
    boolean isNumberPalindrome(Long number) {
        String integerString = Long.toString(number);
        StringBuilder reverseStringBuilder = new StringBuilder();
        reverseStringBuilder.append(integerString);
        return reverseStringBuilder.reverse().toString().equals(integerString);
    }
}
