package com.company;

import java.util.Scanner;

public class StringsBABBAR {

    static String  reverse(String s , int len){
        int end = len - 1;
        String rev = "";
        while(end >= 0){
            rev = rev + s.charAt(end);
            end--;
        }
        return rev;
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        String name = s.next();
        System.out.println("Name is : " + name);

        System.out.println("Length of the name is : " + name.length());

        int len = name.length();

        System.out.println("Reverse of the name is : " + reverse(name,len));

        String name1 = s.next();

        System.out.println("Name is : " + name1);

        System.out.println("Length of the name is : " + name1.length());

        int len1 = name1.length();

        System.out.println("Reverse of the name is : " + reverse(name1,len1));

    }
}
