package com.stackroute.main.java.pe3;
/*
* Create a class with a main( ) that throws an object of class Exception inside a try block.
 a. Give the constructor for Exception a String argument.
 b. Catch the exception inside a catch clause and print the String argument.
 c. Add a finally clause and print a message to prove you were there.

* */
public class ThrowingExceptions {
    public static void main(String[] args) {
        int[] arr = new int[2];
        try {
            System.out.println("Going beyond limits! " + arr[3]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            int[] a = new int[-1];
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        }
        try {
            String item = null;
            item.trim();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
