package com.stackroute.main.java.pe2.problem5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
* Write a boolean method called isEven() in a class called EvenNumTest, which takes an int as input and returns true if the input is even.
* The signature of the method is as follows: public static boolean isEven(int number)
* */
public class EvenOrOdd {

    public static void main(String[] args) throws IOException {
        EvenOrOdd number = new EvenOrOdd();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        if (number.isEven(Integer.parseInt(bufferedReader.readLine()))) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    /**
     * Checks whether the number of is even or odd
     * @param number
     * @return Returns true if the number is even
     */
    boolean isEven(int number) {
        return number % 2 == 0;
    }
}
