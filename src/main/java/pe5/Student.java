package main.java.pe5;

import java.util.Comparator;
import java.util.List;

public class Student implements Comparator<Student> {
    private int studentId;
    private int age;
    private String name;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    List<Student> getSortedStudentList(List<Student> studentList) {
        studentList.sort(new Student());
        return studentList;
    }

    @Override
    public String toString() {
        return String.format("Student ID: %s\nStudent Name:  %s\nStudent Age: %s\n\n", this.studentId, this.name, this.age);
    }

    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        if (firstStudent.age > secondStudent.age) {
            return -1;
        } else if (firstStudent.age < secondStudent.age) {
            return 1;
        } else {
            if (firstStudent.name.compareTo(secondStudent.name) < 0) {
                return -1;
            } else if (firstStudent.name.compareTo(secondStudent.name) > 0) {
                return 1;
            } else {
                return Integer.compare(firstStudent.studentId, secondStudent.studentId);
            }
        }
    }
}
