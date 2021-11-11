package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game_Rock_Paper_Scissor {
    public static void main(String[] args) {
        // 0 for Rock, 1 for Paper, 2 for Scissor
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for Rock , 1 for Paper , 2 for Scissor : ");
        int userInput = sc.nextInt();

        Random ran = new Random();
        int computerInput = ran.nextInt(3);

        if(userInput == computerInput){
            System.out.println("Draw Match!!!");
        }
        else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 ||
        userInput == 2 && computerInput == 1){
            System.out.println("You won!!!");
        }
        else{
            System.out.println("You lost!!!");
        }

        if(computerInput == 0){
            System.out.println("Computer choose : 0 for Rock");
        }
        else if(computerInput ==1){
            System.out.println("Computer choose : 1 for Paper");
        }
        else if(computerInput == 2){
            System.out.println("Computer choose : 2 for Scissor");
        }
    }
}
