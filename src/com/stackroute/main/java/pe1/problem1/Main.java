package com.stackroute.main.java.pe1.problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
* Write a program which accepts a number as input and check whether the given number is palindrome or not If it is a palindrome then
 Add all the even numbers and check whether the sum is more than 25.
 Print success and failure messages for all 3 conditions
* */
public class Main {
    public static void main(String[] args) throws IOException {
        String messageForPalindromeCondition;
        String messageForSumOfEvenNumbersCondition;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Long inputNumber = Long.parseLong(bufferedReader.readLine());
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        DigitAdder digitAdder = new DigitAdder();
        if (digitAdder.addDigits(inputNumber) >= 25) {
            messageForSumOfEvenNumbersCondition = "and the sum of even numbers is greater than 25";
        } else {
            messageForSumOfEvenNumbersCondition = "and the sum of even numbers is less than 25";
        }
        if (palindromeChecker.isNumberPalindrome(inputNumber)) {
            messageForPalindromeCondition = String.format("%d is palindrome ", inputNumber);
        } else {
            messageForPalindromeCondition = String.format("%d is not palindrome ", inputNumber);
        }
        System.out.println(messageForPalindromeCondition + messageForSumOfEvenNumbersCondition);
    }
}
