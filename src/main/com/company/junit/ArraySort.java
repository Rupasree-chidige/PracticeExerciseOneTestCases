package com.company.junit;

public class ArraySort {
    public String sum(int number) {
        int sum = 0;
        int count = 0;
        String result=null;
        int temp = number;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        int array[] = new int[count];
        for (int i = 0; i < count; i++) {
            if (temp % 10 > 0) {
                array[i] = temp % 10;
                temp = temp / 10;

            }
        }
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < count; i++) {

            if ((array[i]) % 2 == 0)
                sum = sum + array[i];
        }
        if(sum>15)
        {
            return "True";
        }
        else {
            return "False";
        }

    }
}