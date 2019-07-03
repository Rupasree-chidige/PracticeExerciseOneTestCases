package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class CheckCharTest {

    CheckChar check;

    @Before
    public void setup() {
        System.out.println("Before");
        check = new CheckChar();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        check = null;
    }


    @Test
    public void givenCharacterShouldReturnLowercase() {
        String result = check.CheckCharacter('a');
        assertEquals("Lowercase letter", result);
    }
    @Test
    public void givenCharacterShouldReturnUppercase() {
        String result = check.CheckCharacter('A');
        assertEquals("Uppercase letter", result);
    }
    @Test
    public void givenCharacterShouldReturnDigit() {
        String result = check.CheckCharacter('2');
        assertEquals("Is a Digit", result);
    }
    @Test
    public void givenCharacterShouldReturnSymbol() {
        String result = check.CheckCharacter('#');
        assertEquals("Is a Special symbol", result);
    }

}