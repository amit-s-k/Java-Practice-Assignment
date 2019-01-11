package com.stackroute.main.java.pe1.problem6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
*
* Write a program that takes a character from the user as input and determines whether the character entered is a capital letter,
 * a small case letter, a digit or a special symbol and display appropriately.
* */
public class CharacterIdentifier {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        CharacterIdentifier characterIdentifier = new CharacterIdentifier();
        characterIdentifier.identifyCharacter(bufferedReader.readLine());
    }

    /**
     * Checks if the letter is a capital letter or small letter or digit or special symbol
     * @param character
     */
    void identifyCharacter(String character) {
        char letter = character.toCharArray()[0];
        if (letter >= 'A' && letter <= 'Z') {
            System.out.println("Capital Letter");
        } else if (letter >= 'a' && letter <= 'z') {
            System.out.println("Small Case Letter");

        } else if (letter >= '0' && letter <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Symbol");
        }
    }
}
