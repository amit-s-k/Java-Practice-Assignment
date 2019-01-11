package com.stackroute.main.java.pe2.problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
* Write a Java method to check if a given number is power of 4
 * */
public class PowerOf4 {
    public static void main(String[] args) throws IOException {
        PowerOf4 powerOf4 = new PowerOf4();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String number = bufferedReader.readLine();
        if (powerOf4.isPowerOfFour(number)) {
            System.out.println("Number is a power of 4");
        } else {
            System.out.println("Number is not a power of 4");
        }
    }

    /**
     * Checks whether input number is a power of 4
     * @param number
     * @return Returns true if the number is a power of four
     */
    boolean isPowerOfFour(String number) {
        long num;
        try {
            num = Long.parseLong(number);
        } catch (Exception e) {
            System.out.println("Input not an integer");
            return false;
        }
        if (num == 0)
            return false;
        while (num != 1) {
            if (num % 4 != 0)
                return false;
            num = num / 4;
        }
        return true;
    }
}
