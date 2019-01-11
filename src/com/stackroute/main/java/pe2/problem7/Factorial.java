package com.stackroute.main.java.pe2.problem7;
/*
*
* Write a program to list all the factorials, that can be expressed as an int (i.e., 32-bit signed integer). Your output shall look like:
Int Factorials:
The factorial of 1 is 1
The factorial of 2 is 2
     ..........
The factorial of 12 is 479001600
he factorial of 13 is out of range
Modify your program and add a method called longFactorial to list all the factorial that can be expressed as a long (64-bit signed integer).The maximum value for long is kept in a constant called Long.MAX_VALUE.
your output shall look like:
Long Factorials:
    The factorial of 1 is is 1.
    The factorial of 2 is is 2.
            ..........
    The factorial of 20 is is 2432902008176640000.
    The factorial of 21 is out of range.
* */
public class Factorial {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int i = 0;
        int num = factorial.getFactorial(i);

        while (num <= factorial.getFactorial(i + 1)) {
            System.out.println("Factorial of " + i + " is " + num);
            i++;
            num = factorial.getFactorial(i);
        }
        System.out.println("\n");
        long j = 0;
        long longnum = factorial.getFactorial(j);
        while (longnum <= factorial.getFactorial(j + 1)) {
            System.out.println("Factorial of " + j + " is " + longnum);
            j++;
            longnum = factorial.getFactorial(j);
        }
    }

    /**
     * Calculates the factorial of integers between 0 - 12
     * @param num
     * @return factorial of the number
     */
     int getFactorial(int num) {
        int result = 1;
        if (num == 0 || num == 1) {
            return result;
        }
        for (int c = 1; c <= num; c++)
            result = result * c;
        return result;
    }

    /**
     * Calculates the factorial of the integers between 13-20
     * @param num
     * @return factorial of the number
     */
     long getFactorial(long num) {
        long result = 1;
        if (num == 0 || num == 1) {
            return result;
        }
        for (long c = 1; c <= num; c++)
            result = result * c;
        return result;
    }
}
