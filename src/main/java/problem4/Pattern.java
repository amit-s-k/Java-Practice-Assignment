package main.java.problem4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        Pattern pattern = new Pattern();
        pattern.printPattern(number);

    }

    public void printPattern(int n) {
        int j = 1;
        int k = 1;
        while (n > 0) {
            int i = 1;
            while (i <= j) {
                System.out.printf(k + " ");
                i++;
            }
            j++;
            k++;
            n--;
        }
    }
}
