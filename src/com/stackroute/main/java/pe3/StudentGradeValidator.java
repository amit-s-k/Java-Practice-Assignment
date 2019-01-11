package com.stackroute.main.java.pe3;

import java.util.List;
import java.util.stream.Collectors;
/*
* Create a class called StudentMarks, which prompts user for the number of students, reads it from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the grades of each of the students and saves them in an int array called stuGrades.
* Your program shall check that the grade is between 0 and 100 else has to trow an error message.
* */
class StudentGradeValidator {
    /**
     * Checks if the grades of students are in the range 0-100
     * @param grades
     * @return Returns true if the the list of grades is valid
     */
    boolean areStudentGradesValid(List<Integer> grades) {
        if (grades == null || grades.isEmpty()) {
            System.out.println("Invalid Input");
            return false;
        }
        return grades.stream().filter(grade -> !(grade >= 0 && grade <= 100)).collect(Collectors.toList()).isEmpty();
    }
}
