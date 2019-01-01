package main.java.problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        OddOrEvenChecker oddOrEvenChecker = new OddOrEvenChecker();
        RangeChecker rangeChecker = new RangeChecker();
        boolean isNumberEven = oddOrEvenChecker.isNumberEven(number);
        boolean isNumberBetweenTwentyAndThirty = rangeChecker.isNumberBetweenTwentyAndThirty(number);
        if (isNumberEven && isNumberBetweenTwentyAndThirty) {
            System.out.println("Jerry");
        } else if (!isNumberEven && isNumberBetweenTwentyAndThirty) {
            System.out.println("Tom");
        }
    }
}
