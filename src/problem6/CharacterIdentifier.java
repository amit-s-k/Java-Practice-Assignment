package problem6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterIdentifier {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        CharacterIdentifier characterIdentifier = new CharacterIdentifier();
        characterIdentifier.identifyCharacter(bufferedReader.readLine());

    }

    public void identifyCharacter(String character) {
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
