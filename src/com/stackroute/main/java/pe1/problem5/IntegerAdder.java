package com.stackroute.main.java.pe1.problem5;

import java.util.Scanner;
/*
* Write a program that reads an unspecified number of integer arguments using Scanner Class and adds them together.
* The program should display total of the given input number and should only consider integer value.The program should display an error message if there are any non integer values
* */
public class IntegerAdder {

    public static void main(String[] args) {
        IntegerAdder integerAdder = new IntegerAdder();
        System.out.println(integerAdder.addIntegers());
    }

    /**
     * This function add the integers from STDIN
     * @return  Returns sum of integers
     */

    int addIntegers() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
        }
        return sum;
    }
}
