// pattern
// A
// A B
// A B C
// A B C D
package com.company;

import java.util.Scanner;

public class pattern_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n = s.nextInt();

        int row = 1;
        while(row<=n){
            int col = 1;
            char ch = (char) ('A'+col-1);
            while(col<=row){
                System.out.print(ch + " ");
                ch++;
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
