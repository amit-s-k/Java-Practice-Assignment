package main.java.pe2.problem5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOrOdd {

    public static void main(String[] args) throws IOException {
        EvenOrOdd number = new EvenOrOdd();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        if (number.isEven(Integer.parseInt(bufferedReader.readLine()))) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    boolean isEven(int number) {
        return number % 2 == 0;
    }
}
