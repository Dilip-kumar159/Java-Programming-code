// pattern
// 1
// 2 3
// 4 5 6
// 7 8 9 10
package com.company;

import java.util.Scanner;

public class pattern_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n = s.nextInt();

        int row = 1;
        int count = 1;
        while(row<=n){
            int col = 1;
            while(col<=row){
                System.out.print(count + " ");
                col++;
                count++;
            }
            System.out.println();
            row++;
        }
    }
}
