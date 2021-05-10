package com.classassignment7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        int Final,Intial,Fuelconsumption,choice;
        Scanner scan = new Scanner(System.in);
        do {
            int enter;
            System.out.println("Enter your intial value of meter: ");
            Intial = scan.nextInt();
            System.out.println("Enter your final value of meter: ");
            Final = scan.nextInt();
            System.out.println("Enter your fuel consumption in distance travelled: ");
            Fuelconsumption = scan.nextInt();
            Odometer value = new Odometer(Intial, Final, Fuelconsumption);
            System.out.println("Do you want to add one more miles press 1: ");
            enter = scan.nextInt();
            if(enter == 1){
                value.addmiles();
            }
            value.SetTheFuelEfficiency();
            value.Display();
            System.out.println("Do you want to reset fuel efficiency then press 1 otherwise 0");
            choice = scan.nextInt();
            if (choice == 1) {
                value.ResetTheOdometer();
            } else {
                System.out.println("Thank for using program");
            }
        }while (choice == 1);
    }
}
