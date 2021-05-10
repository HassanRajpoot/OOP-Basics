package com.classassignment1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int length;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        length = scan.nextInt();
        int[] number =  new int[length];
        System.out.println("Enter the array number: ");
        for(int i = 0;i<length;i++)
        {
            number[i] = scan.nextInt();
        }
        for(int i = 0;i<length;i++)
        {
            Numberchecker num = new Numberchecker(number[i]);
            num.checker();
        }
    }
}
