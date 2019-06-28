package com.company.junit;

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

    @BeforeClass
    public static void setUpBeforeClass() {

        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() {

        System.out.println("AfterClass");
    }

    @Test
    public void givenStringShouldReturnReverseStringcase() {
        String result = reverseString.stringReverse("stackroute");
        assertEquals("etuorkcats", result);
    }
    @Test
    public void givenIntStringShouldReturnReverseStringcase() {
        String result = reverseString.stringReverse("12345");
        assertEquals("54321", result);
    }


}