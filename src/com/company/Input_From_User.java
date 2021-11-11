package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;  // Imported some packages to where particular functions can be used.
public class Input_From_User {
    public static void main(String[] args) {
        System.out.println("Taking Input From The User ");
        Scanner s = new Scanner(System.in); // Created object of class Scanner s  for taking an input
//        System.out.println("Enter the 1st number");
////        int a = s.nextInt(); // So many methods are there to take input from the user one of is this one.
//        float a = s.nextFloat();
//        System.out.println("Enter the 2nd number");
////        int b = s.nextInt();
//        float b = s.nextFloat();
////        int sum = a + b;
//        float sum = a + b;
//        System.out.print("The sum of two number is ");
//        System.out.println(sum);
////        boolean z = s.hasNextInt(); // This hasnextint checks whether the input is correct or not.
//        boolean z = s.hasNextFloat();
//        System.out.println(z);
//        String sc = s.next(); // This works for only one word in a line.
         String sc = s.nextLine(); // This works for entire line.
        System.out.println(sc);

    }
}
