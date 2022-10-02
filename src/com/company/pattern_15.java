// pattern
//      1
//    2 3
//  4 5 6
//7 8 9 10
package com.company;

import java.util.Scanner;

public class pattern_15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        int count = 1;
        while(row<=n){
            int space = 1;
            while(space<=n-row){
                System.out.print(" ");
                space++;
            }
            int col = 1;
            while (col<=row){
                System.out.print(count);
                count++;
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
