// Reverse a number using Buffered Reader class.
package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseBufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a Number : ");
        int num = Integer.parseInt(br.readLine());
        int ans = 0;
        while(num!=0){
            int digit = num%10;
            ans = (ans * 10) + digit;
            num = num / 10;
        }
        System.out.print("Reverse Number is : " + ans);
    }
}
