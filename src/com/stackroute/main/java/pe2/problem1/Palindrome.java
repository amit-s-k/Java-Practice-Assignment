package com.stackroute.main.java.pe2.problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
* Write a Java method to Reverse the given input & Check if it is a Palindrome.
* */
public class Palindrome {
    public static void main(String[] args) throws IOException {
        Palindrome palindrome = new Palindrome();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        if (palindrome.isPalindrome(input)) {
            System.out.println("Input is palindrome");
        } else {
            System.out.println("Input is not palindrome");
        }
    }

    /**
     * Checks whether input string is palindrome or not
     * @param input
     * @return
     */
    boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        return new StringBuilder(input).reverse().toString().equals(input);
    }
}
