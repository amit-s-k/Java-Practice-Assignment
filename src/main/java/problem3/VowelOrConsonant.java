package main.java.problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class VowelOrConsonant {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String word = bufferedReader.readLine();
        VowelOrConsonant vowelOrConsonant = new VowelOrConsonant();
        vowelOrConsonant.isVowelOrConsonant(word);
    }

    public void isVowelOrConsonant(String word) {
        String[] characters = word.toLowerCase().split("");
        for (int i = 0; i < characters.length; i++) {
            char character = characters[i].toCharArray()[0];
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
        return;
    }
}
