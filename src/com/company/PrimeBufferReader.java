// check whether the number is prime or not using a BufferedReader class.
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeBufferReader {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number ");
        int num = Integer.parseInt(br.readLine());
        int b = 1, c = 0;
        while(b<=num){
            if(num % b == 0){
                c += 1;
            }
            b++;
        }
        if(c==2){
            System.out.println(num + " is a Prime Number");
        }
        else{
            System.out.println(num + " is not a Prime Number");
        }
    }
}
