// Converting from binary to decimal
package com.company;

import java.util.Scanner;

public class BinaryToDecimalBABBAR {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The Binary Value : ");
        int n = s.nextInt();
        int ans = 0, i = 0;
        while(n!=0){
            int bit = n%10;
            ans = (int) (bit * Math.pow(2,i)) + ans;
            n = n/10;
            i++;
        }
        System.out.println("Binary to Decimal is : " + ans);

    }
}
