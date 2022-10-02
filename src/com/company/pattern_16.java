//pattern
// 1 2 3 4 5 5 4 3 2 1
// 1 2 3 4 * * 4 3 2 1
// 1 2 3 * * * * 3 2 1
// 1 2 * * * * * * 2 1
// 1 * * * * * * * * 1

package com.company;

import java.util.Scanner;

public class pattern_16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
         while(row<=n){
             int start = 1;
             while(start<=n-row+1){
                 System.out.print(start);
                 start++;
             }
             int star = 1;
             while(star<=row-1){
                 System.out.print("*");
                 star++;
             }
             int star2 = 1;
             while(star2 <=row - 1){
                 System.out.print("*");
                 star2++;
             }
             int col = 1;
             int val = n-row+1;
             while(col<=n-row+1){
                 System.out.print(val);
                 val--;
                 col++;
             }
             System.out.println();
             row++;
         }
    }
}
