package com.stackroute.main.java.pe1.problem4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
* Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6       6 6 . . . nth iteration.
* */
public class Pattern {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        Pattern pattern = new Pattern();
        pattern.printPattern(number);
    }

    /**
     * Prints the pattern 1 2 2 3 3 3 4 4 4 4... if the input is 4
     * * @param input
     */
    void printPattern(int input) {
        int j = 1;
        int k = 1;
        while (input > 0) {
            int i = 1;
            while (i <= j) {
                System.out.printf(k + " ");
                i++;
            }
            j++;
            k++;
            input--;
        }
    }
}
