package com.classassignment8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] Quizes = new int[3];
        int Midterm;
        int Final;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the quiz marks out of 10: ");
        for(int i = 0; i<3 ;i++)
        {
            Quizes[i] = scan.nextInt();
        }
        System.out.println("Enter the midterm marks out of 100: ");
        Midterm = scan.nextInt();
        System.out.println("Enter the final marks out of 100: ");
        Final = scan.nextInt();
        Totalcalculater cal = new Totalcalculater(Quizes[0],Quizes[1],Quizes[2],Midterm,Final);
        System.out.println("Your grade is "+cal.Gradecalculator());
    }
}
