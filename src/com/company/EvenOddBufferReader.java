// Program to check whether the given number is even or odd by using buffer Reader class.
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOddBufferReader {
    public static void main(String[] args) throws IOException {

        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number ");
        int num = Integer.parseInt(b.readLine());
        if(num % 2 == 0){
            System.out.println( num + " is an Even Number");
        }
        else{
            System.out.println( num + " is an Odd Number");
        }
    }
}
