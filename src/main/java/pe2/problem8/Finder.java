package main.java.pe2.problem8;

import java.io.*;
import java.util.Arrays;

public class Finder {
    public File[] findFiles(String folderPath){
        File folder=new File(folderPath);
        return folder.listFiles();
    }
    public String readContent(String fileName) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader(fileName));
        StringBuilder stringBuilder=new StringBuilder();
        String content;
        while ((content=bufferedReader.readLine())!=null){
            stringBuilder.append(content);
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter folder path");
        String folderPath=bufferedReader.readLine();
        Finder finder=new Finder();
        File[] files=finder.findFiles(folderPath);
        System.out.println("Files in the given folder are");
        assert files != null;
        Arrays.stream(files).forEach(System.out::println);
        System.out.println("Enter file name to read from");
        String fileName=bufferedReader.readLine();
        System.out.println("File contents are \n"+finder.readContent(fileName));
    }
}
