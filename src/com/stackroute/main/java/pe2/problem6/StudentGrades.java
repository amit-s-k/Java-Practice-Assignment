package com.stackroute.main.java.pe2.problem6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*
* Write a program, which reads number of students and n grades as input (of int between 0 and 100, inclusive) and displays the average, minimum and maximum.
* Your program shall check for valid input. You should keep all the grades in an int[] and use a method for each of the computations.
* */
public class StudentGrades {

    public static void main(String[] args) throws IOException {
        StudentGrades studentGrades = new StudentGrades();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfStudents = Integer.parseInt(bufferedReader.readLine());
        List<Integer> gradeList = new ArrayList<>();
        int i = 0;

        while (i < numberOfStudents) {
            System.out.println("Enter grade for student " + i + 1);
            gradeList.add(i, Integer.valueOf(bufferedReader.readLine()));
            i++;
        }
        System.out.println("Average grade is " + studentGrades.getAverage(gradeList));
        System.out.println("Maximum grade is " + studentGrades.getMaximum(gradeList));
        System.out.println("Minimum grade is " + studentGrades.getMinimum(gradeList));
    }

    /**
     * Calculates average of a list of integers
     * @param gradeList
     * @return Returns average of list of integers
     */
    float getAverage(List<Integer> gradeList) {
        int sum = gradeList.stream().reduce((a, b) -> a + b).get();
        return sum / gradeList.size();
    }

    /**
     * Finds the minimum integer amongst a list of integers
     * @param gradeList
     * @return minimum integer in the given list
     */
    int getMinimum(List<Integer> gradeList) {
        return gradeList.stream().sorted().collect(Collectors.toList()).get(0);
    }

    /**
     * Finds the maximum integer in the list
     * @param gradeList
     * @return maximum integer in the list
     */
    int getMaximum(List<Integer> gradeList) {
        return gradeList.stream().sorted().collect(Collectors.toList()).get(gradeList.size() - 1);
    }
}
