package problem8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessNumber {
    public static void main(String[] args) throws IOException {
        GuessNumber guessNumber = new GuessNumber();
        guessNumber.guessNumber();

    }

    public void guessNumber() throws IOException {
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
