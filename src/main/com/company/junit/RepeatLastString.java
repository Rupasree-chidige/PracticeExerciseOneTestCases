package com.company.junit;

public class RepeatLastString {
    public String  RepeatLast(String text,int num) {
        if (num > 0) {
            String finalText = text;
            String repeatText = text.substring((text.length() - num), text.length());

            for (int i = 1; i <= num; i++) {
                finalText = finalText.concat(repeatText);
            }
            return finalText;
        }
        return null;
    }

}
