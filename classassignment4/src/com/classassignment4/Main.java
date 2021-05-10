package com.classassignment4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int flag = 1;
        while(flag == 1){
            int someValue, usersomeValue,i= 0;
            System.out.println("Guess the number");
            Scanner scan = new Scanner(System.in);
            someValue = (int)(Math.random()*10);
            for(;i<3;i++){
                System.out.println("Enter you number between 1 to 10: ");
                usersomeValue = scan.nextInt();
                if(someValue==usersomeValue)
                {
                    System.out.println("RIGHT!\nYou have won the game");
                    break;
                }
                else
                {
                    System.out.println("Wrong");
                }
            }
            System.out.println("If you want to play again: press 1 otherwise press anykey");
            flag = scan.nextInt();
        }

    }
}
