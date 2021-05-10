package com.classassignment6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        float Cost,Inflation;
        int Quantity,Years;
        System.out.println("Enter the cost of your product: ");
        Cost = scan.nextFloat();
        System.out.println("Enter the inflation percentage of your product: ");
        Inflation = scan.nextFloat();
        System.out.println("Enter the quantity of your product: ");
        Quantity = scan.nextInt();
        System.out.println("Enter the number of years of your product: ");
        Years = scan.nextInt();
        Inflation product = new Inflation(Cost,Inflation,Quantity,Years);
        product.Inflation_Calculator();
    }
}
