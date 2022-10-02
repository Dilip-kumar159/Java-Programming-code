// pattern
// D
// C D
// B C D
// A B C D

package com.company;

import java.util.Scanner;

public class pattern_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        while (row<=n){
            int col = 1;
                char ch = (char) ('A'+n-row);
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
