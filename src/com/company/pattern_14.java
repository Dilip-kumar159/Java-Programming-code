// pattern
// 1 2 3 4
//   2 3 4
//     3 4
//       4

package com.company;

import java.util.Scanner;

public class pattern_14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        while(row<=n){
            int space = 1;
            while(space<=row-1){
                System.out.print(" ");
                space++;
            }
            int col = 1;
            int val = row;
            while(col<=n-row+1){
                System.out.print(val);
                val++;
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
