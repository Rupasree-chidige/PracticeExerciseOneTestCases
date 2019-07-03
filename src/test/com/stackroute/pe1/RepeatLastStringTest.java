package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class RepeatLastStringTest {
    RepeatLastString repeatLastString;

    @Before
    public void setup() {
        System.out.println("Before");
        repeatLastString = new RepeatLastString();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        repeatLastString = null;
    }


    @Test
    public void givenStringAndRepeatNumShouldReturnConcatinatedString() {
        String result = repeatLastString.RepeatLast("stackroute",3);
        assertEquals("stackrouteuteuteute", result);
    }
    @Test
    public void givenStringAndRepeatNegativeNumberShouldReturnRepeatNumberIsNegative() {
        String result = repeatLastString.RepeatLast("Rupasree",-1);
        assertNull("No of last Repeat number should be greater than 0", result);
    }
    @Test
    public void givenNullhouldReturNull() {
        String result = repeatLastString.RepeatLast(null,1);
        assertNull("Given null as input", result);
    }


}