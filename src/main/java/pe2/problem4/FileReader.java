package main.java.pe2.problem4;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/user/IdeaProjects/Stackroute/src/main/java/pe2/problem4/content.txt");
        BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(file));
        printInUpperCase(bufferedReader);
    }

    private static void printInUpperCase(BufferedReader bufferedReader) throws IOException {
        String string;
        while ((string = bufferedReader.readLine()) != null) {
            System.out.println(string.toUpperCase());
        }
    }
}
