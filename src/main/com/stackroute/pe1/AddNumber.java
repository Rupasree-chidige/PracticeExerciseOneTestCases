package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class AddNumber {
    public int sum(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {

            result = result + numbers[i];

        }
        return result;


    }
}
