package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPalindromeUsingBufferedReader {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String ");
        String str = br.readLine();

        String temp = str;
        StringBuilder sb = new StringBuilder(str) ;
        sb.reverse();

        str = sb.toString();

        System.out.println("The Reverse String is : " + str);

        if(temp.equalsIgnoreCase(str)){
            System.out.println(temp + " is a Palindrome");
        }
        else System.out.println(temp + " is not a Palindrome");
    }
}
