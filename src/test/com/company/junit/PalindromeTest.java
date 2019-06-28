package com.company.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindrome;

    @Before
    public void setup() {
        System.out.println("Before");
        palindrome = new Palindrome();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        palindrome = null;
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
    public void givenIntegerShouldReturnPalindromeAndEvenSumGreater() {
        String result =palindrome.isPalindrome(2468642);
        assertEquals("2468642 is palindrome and the sum of even numbers is greater than 25",result);
    }
    @Test
    public void givenIntegerShouldReturnNotPalindrome() {
        String result =palindrome.isPalindrome(12345);
        assertEquals("12345 is not palindrome", result);
    }
    @Test
    public void givenIntegerShouldReturnPalindromeAndEvenSumLesser() {
        String result =palindrome.isPalindrome(124565421);
        assertEquals("124565421 is palindrome and the sum of even numbers is less than 25",result);
    }
}