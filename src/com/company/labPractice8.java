package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class labPractice8 {
    public static void main(String[] args) throws IOException {
        // program to check whether a given number is palindrome or not using scanner class and buffer reader class
//        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number : ");
        int num = Integer.parseInt(bufferedReader.readLine());
//        int num = scanner.nextInt();
        int temp = num;
        int rev = 0;
        while(temp != 0){
            int rem = temp % 10;
             rev = rev * 10 + rem;
             temp = temp / 10;
        }
        if(num == rev){
            System.out.println("Number " + num + " is Palindrome");
        } else{
            System.out.println("Number " + num + " is Not a Palindrome");
        }
    }
}
