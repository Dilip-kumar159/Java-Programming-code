// pattern
//      *
//     **
//    ***
//   ****
package com.company;

import java.util.Scanner;

public class pattern_09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n = s.nextInt();

        int row = 1;
        while(row<=n){
            int space = 1;
            while(space<=n-row){
                System.out.print(" ");
                space++;
            }
            int col = 1;
            while (col <= row) {
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
