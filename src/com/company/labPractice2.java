package com.company;

public class labPractice2 {
    public static void main(String[] args) {

        // program to print the prime numbers in between the two limits
        if(args.length < 2){
            System.out.println("No Proper Command Line Arguments");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int j;
        for(int i = num1; i < num2; i++){
            for( j = 2; j < i; j++){
                int n = i % j;
                if(n == 0){
                    break;
                }
            }
            if(i == j){
                System.out.println( i + " is a Prime");
            }
        }
    }
}
