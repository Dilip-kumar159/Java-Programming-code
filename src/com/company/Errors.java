package com.company;

import java.util.Scanner;

public class Errors {
    public static void main(String[] args) {
        // SYNTAX ERROR
//        int a = 0 --> No semi-colon , so it is syntax error.
        // d = 104; --> no variable declaration , so it produce syntax error.

        // LOGICAL ERROR
        // print the prime numbers from 1 to 10.
        System.out.println(2);
        for (int i=1; i<5; i++){
            System.out.println(2*i+1);
            // here the output will be 2, 3, 5, 7, 9.
            // where 9 is not a prime number! so it is a logical error.
        }

        // RUNTIME ERROR
        System.out.println("Enter the number to divide the 1000 ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("The final answer after 1000 is divided is : " + 1000/k);
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//	      at com.company.Errors.main(Errors.java:24)
        // The above statement is a RUNTIME ERROR as it is also a EXCEPTION
        // It produces ARITHMETIC EXCEPTION.
    }
}
