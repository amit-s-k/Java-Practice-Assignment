package main.java.problem9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
    public String reverseString(String input){
        return new StringBuilder(input).reverse().toString();

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = bufferedReader.readLine();
        ReverseString reverseString=new ReverseString();
        System.out.println(reverseString.reverseString(inputString));
    }
}
