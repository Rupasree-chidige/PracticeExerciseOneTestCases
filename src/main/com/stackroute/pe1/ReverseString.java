package com.stackroute.pe1;

public class ReverseString {

    public String stringReverse(String input) {


        StringBuilder result = new StringBuilder();
        if(input!=null) {
            char inputArray[] = input.toCharArray();
            int j = 0;

            for (int i = (input.length() - 1); i >= 0; i--) {

                result = result.append(inputArray[i]);

                j++;
            }
            return result.toString();
        }
        else
            return null;
    }
}
