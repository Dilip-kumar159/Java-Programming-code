// pattern
//          1
//        1 2 1
//      1 2 3 2 1
//    1 2 3 4 3 2 1
//  1 2 3 4 5 4 3 2 1

package com.company;

import java.util.Scanner;

public class pattern_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n = s.nextInt();

        int row = 1;
        while (row <= n) {
            int space = 1;
            while (space <= n - row) {
                System.out.print(" ");
                space++;
            }
            int col = 1;
            while (col <= row) {
                System.out.print(col);
                col++;
            }

            int val = row - 1;
            while (val >= 1 ) {
                System.out.print(val);
                val--;
            }
            System.out.println();
            row++;

        }
    }
}
