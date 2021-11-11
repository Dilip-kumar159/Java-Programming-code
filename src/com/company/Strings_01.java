package com.company;
import java.util.Scanner;
public class Strings_01 {
    public static void main(String[] args) {
        // Various method to intialize or use Strings in JAVA
        String name = new String("Dilip");
        System.out.print(name);

        // Second method
        String s = (" is a good boy ");
        System.out.println(s);

        // Getting the name from user and displaying
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Tell me something about you ");
//          String ss = sc.next();
//        String ss = sc.nextLine();
//        System.out.println(ss);
//
        // Using printf() ---> Which works same as in C programming language and format() also works same.
        int a = 20;
        float b = 30.98344f;
        char c = 'D';
        System.out.printf("The value of a is %d and the value of b is %.3f and the character %c \n",a,b,c);
        System.out.format("The value of a is %d and the value of b is %.3f and the character %c ",a,b,c);
    }
}
