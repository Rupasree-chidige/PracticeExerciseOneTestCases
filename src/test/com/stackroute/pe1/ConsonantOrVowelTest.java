package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class ConsonantOrVowelTest {

    ConsonantOrVowel consonantOrVowel;

    @Before
    public void setup() {
        System.out.println("Before");
        consonantOrVowel = new ConsonantOrVowel();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        consonantOrVowel = null;
    }


    @Test
    public void givenStringShouldReturnVowelOrConsonant() {
        String result =consonantOrVowel.CheckConsonantOrVowel("Aud");
        assertEquals("A is a Vowel\nu is a Vowel\nd is a Consonant\n",result);
    }
    @Test
    public void givenStringShouldReturnVowelOrConsonantOrDigit() {
        String result =consonantOrVowel.CheckConsonantOrVowel("A12f");
        assertEquals("A is a Vowel\n1 is a Digit\n2 is a Digit\nf is a Consonant\n", result);
    }

}