package com.classassignment1;

public class Numberchecker {
    int number;
    Numberchecker(int number){
        this.number = number;
    }
    void checker()
    {
        if(number>0)
        {
            System.out.println("The number you entered is positive: "+number);
        }
        else if(number<0)
        {
            System.out.println("The number you entered is negative: "+number);
        }
        else if(number==0)
        {
            System.out.println("The number you entered is equal to zero: "+number);
        }
    }
}
