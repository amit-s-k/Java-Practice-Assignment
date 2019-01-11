package com.stackroute.main.java.pe2.problem7;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    private Factorial factorial;
    @Before
    public void setUp(){
        factorial=new Factorial();
    }
    @Test
    public void testForIntegerFactorialSucess(){
        assertEquals(2,factorial.getFactorial(2));
    }
    @Test
    public void testForIntegerFailure(){
        assertEquals(-522715136,factorial.getFactorial(22));

    }
    @Test
    public void testForLongFactorialSucess(){
        assertEquals(2L,factorial.getFactorial(2L));


    }
    @Test
    public void testForLongFailure(){
        assertEquals(0L,factorial.getFactorial(201L));

    }



}