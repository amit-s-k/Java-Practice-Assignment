package main.java.pe5;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    private Student firstStudent = new Student();
    private Student secondStudent = new Student();
    private Student thirdStudent = new Student();
    private Student fourthStudent = new Student();
    private Student fifthStudent = new Student();
    private List<Student> sortedStudentList = new ArrayList<>();
    private List<Student> unSortedStudentList = new ArrayList<>();

    @Before
    public void setUp() {

        firstStudent.setStudentId(1);
        firstStudent.setAge(22);
        firstStudent.setName("katherine");

        secondStudent.setStudentId(2);
        secondStudent.setAge(22);
        secondStudent.setName("katherine");

        thirdStudent.setStudentId(3);
        thirdStudent.setAge(23);
        thirdStudent.setName("ellie");

        fourthStudent.setStudentId(4);
        fourthStudent.setAge(24);
        fourthStudent.setName("taylor");

        fifthStudent.setStudentId(5);
        fifthStudent.setAge(25);
        fifthStudent.setName("selena");

        unSortedStudentList = Arrays.asList(firstStudent, secondStudent, thirdStudent, fourthStudent, fifthStudent);

        sortedStudentList.add(0, fifthStudent);
        sortedStudentList.add(1, fourthStudent);
        sortedStudentList.add(2, thirdStudent);
        sortedStudentList.add(3, firstStudent);
        sortedStudentList.add(4, secondStudent);
    }

    @Test
    public void testForSortingStudentsSuccess() {

        assertEquals(sortedStudentList.toString(), firstStudent.getSortedStudentList(unSortedStudentList).toString());
    }
}