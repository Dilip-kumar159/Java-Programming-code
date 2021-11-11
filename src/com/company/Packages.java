package com.company;
//import java.util.Scanner;
import java.util.*;
public class Packages {
    public static void main(String[] args) {
        // There are three types of using packages
//        1. importing the package scanner from the library   import.java.util.Scanner;
//        2. importing the all the package from the library    import.java.util.*;
//        3. Not using any import directly using in the main method.
//        Scanner s = new Scanner(System.in);
       java.util.Scanner s = new java.util.Scanner(System.in); // using directly in the main method.
        int a = s.nextInt();
        System.out.println("The value of user input 'A' is " + a);
    }
}
