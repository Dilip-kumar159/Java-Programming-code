package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
     int number;
     int inputNumber;
     int noOfGuessess = 0;

//     public int getNoOfGuessess() {
//         return noOfGuessess;
//     }
//
//     public void setNoOfGuessess(int noOfGuessess) {
//         this.noOfGuessess = noOfGuessess;
//     }

     Game(){
         Random rand = new Random();
         this.number = rand.nextInt(100);
     }
     void takeUserInput(){
         System.out.println("Guess the number");
         Scanner sc = new Scanner(System.in);
         inputNumber = sc.nextInt();

     }
     boolean isCorrectNumber(){
         noOfGuessess++;
         if(inputNumber == number){
             System.out.printf("Yes you guessed it right , it is %d \n you guessed it in %d attempts",number,noOfGuessess);
             return true;
         }
         else if (inputNumber < number){
             System.out.println("Higher Number please!!!");
         }
         else if(inputNumber > number){
             System.out.println("Lower Number please!!!");
         }
         return false;
     }
 }
public class Game_Guess_The_Number {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
