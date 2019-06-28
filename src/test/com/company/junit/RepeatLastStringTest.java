package com.company.junit;

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

    @BeforeClass
    public static void setUpBeforeClass() {

        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() {

        System.out.println("AfterClass");
    }

    @Test
    public void givenCharacterShouldReturnLowercase() {
        String result = repeatLastString.RepeatLast("stackroute",3);
        assertEquals("stackrouteuteuteute", result);
    }
    @Test
    public void givenCharacterShouldReturnUppercase() {
        String result = repeatLastString.RepeatLast("Rupasree",-1);
        assertNull("No of last Repeat number should be greater than 0", result);
    }


}