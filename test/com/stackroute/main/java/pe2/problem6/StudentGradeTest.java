package com.stackroute.main.java.pe2.problem6;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class StudentGradeTest {
    private StudentGrades studentGrades;

    @Before
    public void setUp() {
        studentGrades = new StudentGrades();
    }

    @Test
    public void testForAverage() {
        assertEquals(12, studentGrades.getAverage(Collections.singletonList(12)),0);
    }

    @Test
    public void testForMinimum() {
        assertEquals(12, studentGrades.getMinimum(Collections.singletonList(12)));
    }

    @Test
    public void testForMaximum() {
        assertEquals(12, studentGrades.getMaximum(Collections.singletonList(12)));
    }
}
