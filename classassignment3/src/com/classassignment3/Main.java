package com.classassignment3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int choice;
        Binary b = new Binary();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for ypu choice:\n11) Binary to decimal\n2) Decimal to binary");
        choice = scan.nextInt();
        switch (choice) {
            case (1): {
                b.BinaryToDecimal();
                break;
            }
            case (2): {
                b.numberToBinary();
                break;
            }
        }
    }
}
