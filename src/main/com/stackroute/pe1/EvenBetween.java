package com.stackroute.pe1;

public class EvenBetween {

    public String isEven(int number)
    {
        String result=null;
        if(number==0)
        {
          result="Given zero as input";
          return result;
        }

        boolean between;
        if(number%2==0)
        {
            between=isBetween(number);

            if(between)
            {

              result="Jerry";
            }
            else{
                result="Even and not in between 20 and 30";
            }
        }
        else{
            between=isBetween(number);
            if(between)
            {
                result="Tom";
            }
            else{
                result="Odd and not in between 20 and 30";
            }

        }
       return result;
    }
    private boolean isBetween(int number)
    {
        if(number>20 && number<30)
        {
            return  true;
        }
        return false;
    }
}
