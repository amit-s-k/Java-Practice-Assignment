package main.java.pe3;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class AdditionOfMatricesTest {
    private static final int NUMBER_OF_ROWS = 3;
    private static final int NUMBER_OF_COLOUMNS = 4;
    private static final int[][] VALID_MATRIX_1 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
    };
    private static final int[][] VALID_MATRIX_2 = {
            {-1, -2, -3, -4},
            {-5, -6, -7, -8},
            {-9, -10, -11, -12},
    };
    private static final int[][] VALID_MATRIX_3 = {
            {1, -2, -3, -4},
            {-5, -6, -7, -8},
            {-9, -10, -11, -12},
    };
    private AdditionOfMatrices additionOfMatrices;

    @Before
    public void setUp() {
        additionOfMatrices = new AdditionOfMatrices();
    }

    @Test
    public void testForSumOfMatricesSuccess() {
        assertEquals(new int[NUMBER_OF_ROWS][NUMBER_OF_COLOUMNS], additionOfMatrices.addMatrices(VALID_MATRIX_1, VALID_MATRIX_2, NUMBER_OF_ROWS, NUMBER_OF_COLOUMNS));
    }

    @Test
    public void testForSumOfMatricesFailure() {
        assertNotEquals(VALID_MATRIX_3, additionOfMatrices.addMatrices(VALID_MATRIX_1, VALID_MATRIX_2, NUMBER_OF_ROWS, NUMBER_OF_COLOUMNS));
    }

    @Test
    public void testForSumOfMatricesForInvalidInput() {
        assertNull(additionOfMatrices.addMatrices(null, VALID_MATRIX_2, NUMBER_OF_ROWS, NUMBER_OF_COLOUMNS));
    }
}