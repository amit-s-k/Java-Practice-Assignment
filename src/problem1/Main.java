package problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String messageForPalindromeCondition = "";
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
