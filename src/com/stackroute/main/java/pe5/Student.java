package com.stackroute.main.java.pe5;

import java.util.Comparator;
import java.util.List;
/*
* Create a Student class that represents the following information of a student: id, name, and age all
the member variables should be private .
a. Implement `getter and setter` .
b. Create a `StudentSorter` class that implements `Comparator interface` .
c. Write a class `Maintest` create Student class object(minimum 5)
d. Add these student object into a List of type Student .
e. Sort the list based on their age in decreasing order, for student having same
age, sort based on their name.
f. For students having same name and age, sort them according to their ID.
* */
public class Student implements Comparator<Student> {
    private int studentId;
    private int age;
    private String name;

    void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setName(String name) {
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
