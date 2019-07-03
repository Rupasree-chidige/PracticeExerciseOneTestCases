package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class AddNumberTest {
    AddNumber addNumber;

    @Before
    public void setup() {
        System.out.println("Before");
        addNumber = new AddNumber();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        addNumber = null;
    }



    @Test
    public void givenIntArrrayShouldReturnSumOfAllIntegers() {
        int result =addNumber.sum(new int[]{3,6,8,9,10});
        assertEquals(36,result);
    }
    @Test
    public void givenEmptyIntArrrayShouldReturnZero() {
        int result =addNumber.sum(new int[]{});
        assertEquals(0, result);
    }



}