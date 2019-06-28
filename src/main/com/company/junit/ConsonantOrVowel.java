package com.company.junit;

public class ConsonantOrVowel {
    public String CheckConsonantOrVowel(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] inputarray = input.toCharArray();
        if (input.length() > 1) {
            for (int i = 0; i < input.length(); i++) {
                if (Character.isAlphabetic(inputarray[i])) {
                    char ch = inputarray[i];
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                        stringBuilder = stringBuilder.append(inputarray[i] + " is a Vowel\n");
                    else
                        stringBuilder = stringBuilder.append(inputarray[i] + " is a Consonant\n");
                } else {
                    stringBuilder = stringBuilder.append(inputarray[i] + " is a Digit\n");
                }
            }

        }
        return stringBuilder.toString();

    }
}