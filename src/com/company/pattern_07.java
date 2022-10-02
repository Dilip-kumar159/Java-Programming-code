// pattern
// A
// B C
// D E F
// G H I J
package com.company;

import java.util.Scanner;

public class pattern_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n = s.nextInt();

        int row = 1;
        char val = 'A';
        while(row<=n){
            int col = 1;
            while(col<=row){
                System.out.print(val + " ");
                val++;
                col++;

            }
            System.out.println();
            row++;
        }
    }
}
