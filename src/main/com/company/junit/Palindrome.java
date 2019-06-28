package com.company.junit;

public class Palindrome {
    public String isPalindrome(int number) {
        String result=null;
        int resultEven=0;
        int temp = number, sum = 0, rem;
        while (number != 0) {
            rem = number % 10;
            sum = sum * 10 + rem;
            number = number / 10;
        }
        if (sum == temp) {

            resultEven= evenNumbersSum(temp);
            if(resultEven>25)
                result=temp+" is palindrome and the sum of even numbers is greater than 25";
            else
                result=temp+" is palindrome and the sum of even numbers is less than 25";

        }
        else{
           result=temp+" is not palindrome";
        }
        return result;
    }



    private int evenNumbersSum(int number){
        int evenSum=0;

        while (number!=0)
        {
            int rem=0;
            rem=number%10;
            if(rem%2==0)
            {
                evenSum=evenSum+rem;
            }
            number=number/10;
        }

        return evenSum;

    }
}
