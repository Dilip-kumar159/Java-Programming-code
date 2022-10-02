package com.company;

import java.util.Scanner;

public class StringPalindrome {

    public static int index(char c){

        if(c >= 'a' && c <='z' ){
            return c;
        }
        else{
            return (char) (c - 'A' + 'a');
        }
    }
    public static boolean palindrome(String name){

        int start = 0;
        int end = name.length()-1;

        while (start <= end){

            if((index(name.charAt(start++))) != (index(name.charAt(end--)))){
                return false;
                }
           }
        return true;
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = s.nextLine();

        System.out.println(name);
        if(palindrome(name)){
            System.out.println("The " + name +  " is a Palindrome ");
        }
        else{
            System.out.println("The " + name + " is not a Palindrome ");
        }
    }
}
