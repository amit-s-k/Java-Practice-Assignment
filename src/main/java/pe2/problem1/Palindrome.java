package main.java.pe2.problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public boolean isPalindrome(String input){
        return new StringBuilder(input).reverse().toString().equals(input);

    }
    public static void main(String [] args) throws IOException {
        Palindrome palindrome=new Palindrome();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String input=bufferedReader.readLine();
        if(palindrome.isPalindrome(input)){
            System.out.println("Input is palindrome");
        }else {
            System.out.println("Input is not palindrome");
        }
    }
}
