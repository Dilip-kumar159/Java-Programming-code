package com.company;

import java.util.Scanner;

public class Nested_try_Catch_block {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 34;
        marks[1] = 94;
        marks[2] = 55;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index ");
        int ind = sc.nextInt();

        System.out.println("Enter the number to be divide ");
        int num = sc.nextInt();

        try {
            try {
                System.out.println("The entered index is : " + ind);
                System.out.println("The value after the array-value/number  is : " + marks[ind] / num);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Failed reason is : " + e);
                System.out.println("Exception in level 2 that is inner try block");
            }
        }
        catch (ArithmeticException e1){
            System.out.println("Failed reason is : ");
            System.out.println("Exception in level 1 that is outer try block");
        }
        System.out.println("Thank you for using program");
    }
}
