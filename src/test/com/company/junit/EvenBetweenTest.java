package com.company.junit;

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

    @BeforeClass
    public static void setUpBeforeClass() {

        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() {

        System.out.println("AfterClass");
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

}