package com.stackroute.main.java.pe1.problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
* Write a program which accepts an integer number as input from the user and perform the following conditional checks:
 Print Tom if number is odd and exists between 20 to 30
 Print Jerry, if number is even and exists between 20 and 30
* */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        OddOrEvenChecker oddOrEvenChecker = new OddOrEvenChecker();
        RangeChecker rangeChecker = new RangeChecker();
        boolean isNumberEven = oddOrEvenChecker.isNumberEven(number);
        boolean isNumberBetweenTwentyAndThirty = rangeChecker.isNumberBetweenTwentyAndThirty(number);
        if (isNumberEven && isNumberBetweenTwentyAndThirty) {
            System.out.println("Jerry");
        } else if (!isNumberEven && isNumberBetweenTwentyAndThirty) {
            System.out.println("Tom");
        }
    }
}
