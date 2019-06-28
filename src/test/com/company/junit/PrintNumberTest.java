package com.company.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class PrintNumberTest {

    PrintNumber printNumber;

    @Before
    public void setup() {
        System.out.println("Before");
        printNumber = new PrintNumber();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        printNumber = null;
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
    public void givenShouldReturnUppercase() {
        String result = printNumber.printNumberRepeated(4);
        assertEquals("1 2 2 3 3 3 4 4 4 4", result);
    }
    @Test
    public void givenNegativeIntShouldReturnNull() {
        String result = printNumber.printNumberRepeated(-2);
        assertNull("Number Should be Greater than 0",result);
    }


}