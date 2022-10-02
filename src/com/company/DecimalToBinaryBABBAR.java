// converting Decimal to Binary

package com.company;

import java.util.Scanner;

public class DecimalToBinaryBABBAR {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The Decimal Value : ");
        int n = s.nextInt();
        int ans = 0, i = 0;
        while(n!=0){
            int digit = n&1;
            ans = (int) ((digit * Math.pow(10,i)) + ans);
            n = n>>1;
            i++;
        }
        System.out.println("Decimal to Binary is : " + ans);
    }
}
