package com.company;

import java.util.Scanner;

public class FiboPractice {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Number ");
        int n = s.nextInt();

        int a = 1 , b = 1;
        int ans  = 0;
        System.out.print(a + " + " + b + " + ");
        for(int i=3; i<=n; i++){
            int  c = a + b;

        System.out.print( c + " + " );
            a = b;
            b = c;
        }
        System.out.println();
        System.out.println("sum value is : " + b);
    }
}
