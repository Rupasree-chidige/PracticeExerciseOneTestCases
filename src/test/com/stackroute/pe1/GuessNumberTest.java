package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class GuessNumberTest {

    GuessNumber guessNumber;

    @Before
    public void setup() {
        System.out.println("Before");
        guessNumber = new GuessNumber();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        guessNumber = null;
    }

    @Test
    public void givenIntegerShouldReturnLessThanOriginalNumber() {
        String result =guessNumber.checkMatched(20);
        assertEquals("Number Gussed is less than original Number",result);
    }
    @Test
    public void givenIntegerShouldReturnMatchedWithOriginalNum() {
        String result =guessNumber.checkMatched(39);
        assertEquals("Number Gussed matches the original number", result);
    }
    @Test
    public void givenIntegerShouldReturnGreaterThanOriginalNum() {
        String result =guessNumber.checkMatched(45);
        assertEquals("Number Gussed is more than original Number", result);
    }
    @Test
    public void givenNegativeShouldReturnGreaterThanOriginalNum() {
        String result =guessNumber.checkMatched(-2);
        assertEquals("Number Gussed is less than original Number", result);
    }
    @Test
    public void givenzeroShouldReturnGreaterThanOriginalNum() {
        String result =guessNumber.checkMatched(0);
        assertEquals("Number Gussed is less than original Number", result);
    }
}