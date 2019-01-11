package com.stackroute.main.java.pe3;
/*
* Create a class with a main( ) that throws an object of class Exception inside a try block.
 a. Give the constructor for Exception a String argument.
 b. Catch the exception inside a catch clause and print the String argument.
 c. Add a finally clause and print a message to prove you were there.

* */
public class TryAndCatchTutorial {
    public static void main(String[] args) {
        String message = "You naughty developer ;) ";
        try {
            throw new IllegalArgumentException(message);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("We'll stay forever this way :P ");
        }
    }
}
