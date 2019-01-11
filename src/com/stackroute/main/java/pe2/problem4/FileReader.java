package com.stackroute.main.java.pe2.problem4;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
/*
* Write a program to read the content of a text file,
* convert the content in upper case and print the same in console along with the length of the file.
* */
public class FileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/user/IdeaProjects/Stackroute/src/com.stackroute.main/java/pe2/problem4/content.txt");
        BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(file));
        printInUpperCase(bufferedReader);
    }

    /**
     * Prints given input in uppercase
     * @param bufferedReader
     * @throws IOException
     */
    private static void printInUpperCase(BufferedReader bufferedReader) throws IOException {
        String string;
        while ((string = bufferedReader.readLine()) != null) {
            System.out.println(string.toUpperCase());
        }
    }
}
