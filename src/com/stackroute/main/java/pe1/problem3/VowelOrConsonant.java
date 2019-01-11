package com.stackroute.main.java.pe1.problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
* Create a program that accepts a word as input and checks for each single character letter in the word whether it is a consonant or vowel.
Condition:
 Print an error message if the input is not a letter
If the input having more than one letter, print the required output Vowel or Consonant) for each letter
*/
public class VowelOrConsonant {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String word = bufferedReader.readLine();
        VowelOrConsonant vowelOrConsonant = new VowelOrConsonant();
        vowelOrConsonant.isVowelOrConsonant(word);
    }

    /**
     * Prints Vowel if the character is a vowel.
     * Prints Consonant if the character is a consonant
     * Prints Not an Alphabet if the character is a special symbol
     * @param word
     */
    void isVowelOrConsonant(String word) {
        String[] characters = word.toLowerCase().split("");
        for (String character1 : characters) {
            char character = character1.toCharArray()[0];
            if (character >= 'a' && character <= 'z') {
                if (Arrays.asList('a', 'e', 'i', 'o', 'u').contains(character)) {
                    System.out.printf("Vowel ");
                } else {
                    System.out.printf("Consonant ");
                }
            } else {
                System.out.println("Not an alphabet");
            }
        }
    }
}
