package com.stackroute.pe1;

public class GuessNumber {

    public String checkMatched(int gussedNum)
    {

     int ran=39;

        String result=null;
        if(gussedNum==ran)
        {

            result="Number Gussed matches the original number";
        }else if(gussedNum>ran)
        {
            result="Number Gussed is more than original Number";
        } else {
            result="Number Gussed is less than original Number";
        }
        return result;
    }


}



