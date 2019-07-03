package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString reverseString;

    @Before
    public void setup() {
        System.out.println("Before");
        reverseString = new ReverseString();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        reverseString = null;
    }

    @Test
    public void givenStringShouldReturnReverseOfString() {
        String result = reverseString.stringReverse("stackroute");
        assertEquals("etuorkcats", result);
    }
    @Test
    public void givenStringContainsIntegersShouldReturnReverseString() {
        String result = reverseString.stringReverse("12345");
        assertEquals("54321", result);
    }
    @Test
    public void givenNullStringShouldReturnGivenNullAsString() {
        String result = reverseString.stringReverse(null);
        assertNull("Given Null as String", result);
    }


}