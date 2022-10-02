// pattern
// * * * *
// * * *
// * *
// *
package com.company;

import java.util.Scanner;

public class pattern_13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        int count = 1;
        while(row<=n){
            int col = 1;
            while(col<=n-row+1){
                System.out.print(count+ " ");
                count++;
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
