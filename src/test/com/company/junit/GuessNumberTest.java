package com.company.junit;

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

    @BeforeClass
    public static void setUpBeforeClass() {

        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() {

        System.out.println("AfterClass");
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
}