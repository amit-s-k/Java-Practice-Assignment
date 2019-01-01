package main.java.problem1;

public class PalindromeChecker {

    public boolean isNumberPalindrome(Long number) {
        String integerString = Long.toString(number);
        StringBuilder reverseStringBuilder = new StringBuilder();
        reverseStringBuilder.append(integerString);
        return reverseStringBuilder.reverse().toString().equals(integerString);
    }
}
