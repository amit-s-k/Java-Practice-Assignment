package main.java.pe2.problem6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    float getAverage(List<Integer> gradeList) {
        int sum = gradeList.stream().reduce((a, b) -> a + b).get();
        return sum / gradeList.size();
    }

    int getMinimum(List<Integer> gradeList) {
        return gradeList.stream().sorted().collect(Collectors.toList()).get(0);
    }

    int getMaximum(List<Integer> gradeList) {
        return gradeList.stream().sorted().collect(Collectors.toList()).get(gradeList.size() - 1);
    }
}
