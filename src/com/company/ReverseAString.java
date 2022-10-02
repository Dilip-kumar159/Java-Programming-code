package com.company;

import java.util.Scanner;

public class ReverseAString {

    public  static String reverse(String name){

        String rev = "";
        int end = name.length()-1;

        while(end >= 0){
            rev  = rev + name.charAt(end);
            end--;
        }
        return rev;
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String name = s.nextLine();

        System.out.println("Before Reversing a String");
        System.out.println(name);

//        String name1 = reverse(name);
        System.out.println("After Reversing a String");
        System.out.println( reverse(name));



    }
}
