package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenBetweenTest {

    EvenBetween evenBetween;

    @Before
    public void setup() {
        System.out.println("Before");
        evenBetween = new EvenBetween();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        evenBetween = null;
    }



    @Test
    public void givenIntegerShouldReturnEvenNotBetween() {
        String result =evenBetween.isEven(234);
        assertEquals("Even and not in between 20 and 30",result);
    }
    @Test
    public void givenIntegerShouldReturnJerry() {
        String result =evenBetween.isEven(22);
        assertEquals("Jerry", result);
    }
    @Test
    public void givenIntegerShouldReturnTom() {
        String result =evenBetween.isEven(23);
        assertEquals("Tom",result);
    }
    @Test
    public void givenIntegerShouldReturnOddNotBetween() {
        String result =evenBetween.isEven(231);
        assertEquals("Odd and not in between 20 and 30",result);
    }
    @Test
    public void givenZeroShouldReturnGivenInputZero() {
        String result =evenBetween.isEven(0);
        assertEquals("Given zero as input",result);
    }
    @Test
    public void givenNegativeIntegerShouldOddNotBetween() {
        String result =evenBetween.isEven(-31);
        assertEquals("Odd and not in between 20 and 30",result);
    }

}