package com.company.junit;

public class CheckChar {

    public String CheckCharacter(char var) {
        String result = null;
        if (Character.isDigit(var))
            result = "Is a Digit";
        else if (Character.isUpperCase(var))
            result = "Uppercase letter";
        else if (Character.isLowerCase(var))
            result = "Lowercase letter";
        else
            result = "Is a Special symbol";
        return result;

    }
}
