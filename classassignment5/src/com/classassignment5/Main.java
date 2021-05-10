package com.classassignment5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] hours;
        int length;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of customer:");
        length = scan.nextInt();
        String[] name = new String[length];
        hours = new int[length];
        ParkingPrice[] price = new ParkingPrice[length];
        System.out.println("Enter the customer info");
        for(int i = 0;i<length;i++)
        {
            System.out.println("Enter your name for customer " + (i+1));
            name[i] = scan.next();
            System.out.println("Enter the hours of parking:");
            hours[i] = scan.nextInt();
        }
        for(int i = 0;i<length;i++)
        {
            price[i] = new ParkingPrice(hours[i]);
        }
        for(int i = 0;i<length;i++){
            System.out.println("Your name is "+ name[i]);
            System.out.println("Your bill is "+price[i].billcalculator());
        }
    }
}
