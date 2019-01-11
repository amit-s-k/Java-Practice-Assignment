package com.stackroute.main.java.pe1.problem10;

import java.util.Scanner;
/*
* Write a program to reverse any string without using String Buffer.
* */
public class PrintLastNCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int repeatFactor = scanner.nextInt();
        PrintLastNCharacters printLastNCharacters = new PrintLastNCharacters();
        printLastNCharacters.printLastNCharacters(input, repeatFactor);
    }

    /**
     * Appends last n charcters of input string to input
     * @param input
     * @param repeatFactor
     */
    void printLastNCharacters(String input, int repeatFactor) {
        String repeatString = "";
        for (int i = repeatFactor; i > 0; i--) {
            repeatString = repeatString.concat(String.valueOf(input.charAt(input.length() - i)));
        }
        System.out.println(input.concat(repeatString.repeat(repeatFactor)));
    }
}
