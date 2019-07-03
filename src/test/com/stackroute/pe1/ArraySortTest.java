package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class ArraySortTest {

    ArraySort arraySort;

    @Before
    public void setup() {
        System.out.println("Before");
        arraySort = new  ArraySort();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        arraySort = null;
    }


    @Test
    public void givenIntegerShouldReturnFalseIfSumOfEvenNumbersGreaterThan20() {
        String result =arraySort.sum(234534);
        assertEquals("False",result);
    }
    @Test
    public void givenIntegerShouldReturnTrueIfSumOfEvenNumbersLessThan20() {
        String result =arraySort.sum(646821);
        assertEquals("True", result);
    }

}