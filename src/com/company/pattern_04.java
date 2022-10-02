// pattern
// A B C D
// A B C D
// A B C D
// A B C D

package com.company;

import java.util.Scanner;

public class pattern_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n = s.nextInt();

        int row = 1;
        while(row<=n){
            int col = 1;
            while(col<=n){
            char ch = (char) ('A'+col-1);
                System.out.print(ch + " ");
                ch++;
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
