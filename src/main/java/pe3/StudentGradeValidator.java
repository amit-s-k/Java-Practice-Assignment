package main.java.pe3;

import java.util.List;
import java.util.stream.Collectors;

class StudentGradeValidator {
    boolean areStudentGradesValid(List<Integer> grades) {
        if (grades == null || grades.isEmpty()) {
            System.out.println("Invalid Input");
            return false;
        }
        return grades.stream().filter(grade -> !(grade >= 0 && grade <= 100)).collect(Collectors.toList()).isEmpty();
    }
}
