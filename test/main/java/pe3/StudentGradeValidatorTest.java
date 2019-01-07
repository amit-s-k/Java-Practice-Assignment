package main.java.pe3;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class StudentGradeValidatorTest {
    private static final List<Integer> VALID_GRADES = Arrays.asList(12, 23, 34, 45);
    private static final List<Integer> INVALID_GRADES = Arrays.asList(122, 23, 34, 45);
    private StudentGradeValidator studentGradeValidator;

    @Before
    public void setUp() {
        studentGradeValidator = new StudentGradeValidator();
    }

    @Test
    public void testForGradesSucess() {
        assertTrue(studentGradeValidator.areStudentGradesValid(VALID_GRADES));
    }

    @Test
    public void testForGradesForNull() {
        assertFalse(studentGradeValidator.areStudentGradesValid(null));
    }
    @Test
    public void testForGradesFailure() {
        assertFalse(studentGradeValidator.areStudentGradesValid(INVALID_GRADES));
    }
}