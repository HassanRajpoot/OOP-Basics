package com.classassignment3;

import java.util.Scanner;

public class Binary {
    public void numberToBinary() {
        Scanner b = new Scanner(System.in);
        int decimal;
        String binary;
        System.out.println("Enter the decimal number you want to onvert: ");
        decimal = b.nextInt();
        binary = String.valueOf((decimal % 2));
        decimal = decimal / 2;
        while (decimal != 0) {
            binary += String.valueOf((decimal % 2));
            decimal = decimal / 2;
        }
        System.out.println("Your binary number is: " + binary);

    }
    void BinaryToDecimal() {
        Scanner b = new Scanner(System.in);
        int i = 1, binary, decimal, decimalsum = 1;
        System.out.println("Enter the binary number you want to convert in decimal: ");
        binary = b.nextInt();
        binary = binary / 2;
        while (binary > 0) {
            decimal = (int) ((binary % 2) * Math.pow(2, i));
            decimalsum += decimal;
            i++;
            binary = binary / 10;
        }
        System.out.println("The decimal number is: " + decimalsum);
    }

}
