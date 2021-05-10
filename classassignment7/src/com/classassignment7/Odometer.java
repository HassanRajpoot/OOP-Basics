package com.classassignment7;

import java.util.Scanner;

public class Odometer {
    float MilesDriven;
    static double FuelEfficiency;
    int Intial,Final,Fuelconsumption;;
    Odometer(int Intial,int Final,int Fuelconsumption){
        this.Intial = Intial;
        this.Final = Final;
        this.Fuelconsumption = Fuelconsumption;
    }
    void ResetTheOdometer()
    {
        FuelEfficiency = 0;
    }
    void SetTheFuelEfficiency(){
        MilesDriven = Final - Intial;
        FuelEfficiency = (MilesDriven / Fuelconsumption / 100) * 2.825;
    }
    void addmiles()
    {
        int miles;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the new miles: ");
        miles = scan.nextInt();
        this.MilesDriven += miles;
    }
    void Display()
    {
        System.out.println("The Fuel Efficiency of Your car is "+ FuelEfficiency+" Miles/Liter");
    }

}
