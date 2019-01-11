package com.stackroute.main.java.pe2.problem8;

import java.io.*;
import java.util.Arrays;
/*
*
* Write a program to find all files of a folder and select only given extention fileName
* and read content of this file using byte array
* */
public class Finder {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter folder path");
        String folderPath = bufferedReader.readLine();
        Finder finder = new Finder();
        File[] files = finder.findFiles(folderPath);
        System.out.println("Files in the given folder are");
        assert files != null;
        Arrays.stream(files).forEach(System.out::println);
        System.out.println("Enter file name to read from");
        String fileName = bufferedReader.readLine();
        System.out.println("File contents are \n" + finder.readContent(fileName));
    }

    /**
     * Finds  list of files present in a folder
     * @param folderPath
     * @return Returns a File array consisting of list of files
     */
    private File[] findFiles(String folderPath) {
        File folder = new File(folderPath);
        return folder.listFiles();
    }

    /**
     * Reads content from a file
     * @param fileName
     * @return Returns content as a String
     * @throws IOException
     */
    private String readContent(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        StringBuilder stringBuilder = new StringBuilder();
        String content;
        while ((content = bufferedReader.readLine()) != null) {
            stringBuilder.append(content);
        }
        return stringBuilder.toString();
    }
}
