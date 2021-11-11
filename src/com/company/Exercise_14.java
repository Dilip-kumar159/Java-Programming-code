package com.company;

import java.util.Scanner;

class MaxRetriesException extends Exception{
    public String tostring() {
        return "Max Retries Exception ";
    }
}
public class Exercise_14 {
    public static void max() throws MaxRetriesException {
        try{
            throw new MaxRetriesException();
        }
        catch (MaxRetriesException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws MaxRetriesException {
        // Problem 01
        // SYNTAX ERROR
        // int a = 12 --> There is no semi-colon.
        // LOGICAL ERROR
//        int age = 54;
//        int year_born = 2000 - 54; // --> There is no logic behind calculating the year-born.
//        // RUNTIME ERROR
//        int x = 32;
//        int y = 0;
//        int z = x/y; // --> There is a ARITHEMETICEXCEPTION  zero is not able to divide.

        // problem 02
        try {
            int a = 43;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("HaHa ");
            System.out.println(e);

        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.out.println("HeHe");
        }

        // problem 03
//        int [] marks = new int[3];
//        marks[0] = 34;
//        marks[1] = 94;
//        marks[2] = 55;
//        Scanner s = new Scanner(System.in);
//        boolean flag = true;
//        int i = 0;
//        while (flag && i<5){
//            try{
//                System.out.println("Enter the value of index");
//                int index = s.nextInt();
//                System.out.println("The index is : " + marks[index]);
//                break;
//            }
//            catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("ArrayIndexOutOfBoundsException");
//                i++;
//            }
//        }
//        if(i>=5){
//            System.out.println("I is max retrieved and exit the loop, ERROR" );
//        }
        int[] marks = new int[3];
        marks[0] = 34;
        marks[1] = 94;
        marks[2] = 55;
        Scanner s = new Scanner(System.in);
        boolean flag = true;
        int i = 0;
        while (flag && i < 5) {
            System.out.println("Enter the value of index");
            int index = s.nextInt();
            System.out.println("The index is : " + marks[index]);
            break;
//                throw new MaxRetriesException();

        }
        if (i >= 5) {
            System.out.println("I is max retrieved and exit the loop, ERROR");
        }
    }
}
