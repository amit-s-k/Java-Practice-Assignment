package main.java.problem7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
@RunWith(JUnit4.class)
public class SortedSumTest {
    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private SortedSum sortedSum = new SortedSum();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDown() {
        System.setOut(System.out);
    }

    @Test
    public void testForSortedSum() {
        sortedSum.sortAndSumDigits("123");
        assertEquals(String.format("Sorted number in non-increasing order :3\nSorted number in non-increasing order :2\nSorted number in non-increasing order :1\nSum of even numbers: 2\nfalse\n"), outputStream.toString());
    }
}