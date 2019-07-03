package com.stackroute.pe1;

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



    @Test
    public void givenIntegerShouldReturnRepeatedNumberString() {
        String result = printNumber.printNumberRepeated(4);
        assertEquals("1 2 2 3 3 3 4 4 4 4", result);
    }
    @Test
    public void givenNegativeIntShouldReturnNull() {
        String result = printNumber.printNumberRepeated(-2);
        assertNull("Number Should be Greater than 0",result);
    }
    @Test
    public void givenZeroShouldReturnEmpty() {
        String result = printNumber.printNumberRepeated(0);
        assertNull("Number Should be Greater than 0",result);
    }

}