package main.java.problem10;

import java.util.Scanner;

public class PrintLastNCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int repeatFactor = scanner.nextInt();
        PrintLastNCharacters printLastNCharacters = new PrintLastNCharacters();
        printLastNCharacters.printLastNCharacters(input, repeatFactor);

    }

    public void printLastNCharacters(String input, int repeatFactor) {
        String repeatString = "";
        for (int i = repeatFactor; i > 0; i--) {
            repeatString = repeatString.concat(String.valueOf(input.charAt(input.length() - i)));
        }
        System.out.println(input.concat(repeatString.repeat(repeatFactor)));

    }
}
