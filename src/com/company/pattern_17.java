package com.company;

import java.util.Scanner;

public class pattern_17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1, col = 1;
            char ch = (char) ('A'+col-1);
        for (row = 1; row<=n; row++){
            for( col = 1; col<=n-row+1; col++){
                System.out.print( ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
