package com.company;
import java.util.Scanner;
public class Exercise_04 {
    public static void main(String[] args) {

        // Question 01
        // Checking whether a year is leap year or not
        int year;
//        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
//        year = sc.nextInt();
//        if (year % 400 == 0 || year % 4 == 0 || year % 100 == 0) {
//            System.out.println("The entered year is leap year ");
//        }
////        else if(year % 100 == 0)
////        {
////            System.out.println("The entered year is not a leap year ");
////        }
//        else {
//            System.out.println("The entered year is not a leap year ");
//        }

//        Question 2
        String website;
        System.out.println("Entered the website name ");
        website = sc.next();
        if ( website.endsWith(".org"))
        {
            System.out.println("This website is a Organisation website");
        } else if (website.endsWith(".com"))
        {
            System.out.println("This website is a Commercial website");
        }
        else if (website.endsWith(".in"))
        {
            System.out.println("The website is a Indian website");
        }
        else{
            System.out.println("The entered website is not valid");
        }

    }
}
