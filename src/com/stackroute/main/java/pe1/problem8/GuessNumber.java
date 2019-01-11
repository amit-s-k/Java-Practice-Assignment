package com.stackroute.main.java.pe1.problem8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
* Write a program which accepts a number from user as input (set the limit say 1 - 50 or 1 - 100) User should guess until the the target number is guessed correctly.
Print separate messages for the following:
    a. Number guessed is more than original number
    b. Number guessed is less than original number
    c. Number guessed matches the original number
* */
public class GuessNumber {
    public static void main(String[] args) throws IOException {
        GuessNumber guessNumber = new GuessNumber();
        guessNumber.guessNumber();
    }

    /**
     * Guesses the input is equal to target or not
     * @throws IOException
     */
    void guessNumber() throws IOException {
        int target = 25;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bufferedReader.readLine());
        while (input != target) {
            if (input < target) {
                System.out.println("Number guessed is less than original number");
            } else {
                System.out.println("Number guessed is more than original number");
            }
            input = Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println("Number guessed matches the original number");
    }
}
