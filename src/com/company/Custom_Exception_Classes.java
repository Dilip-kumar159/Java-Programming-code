package com.company;

import java.util.Scanner;

class My_exception extends Exception{
    public String toString(){
        return "This is toString";
    }
    public String getMessage(){
        return "This is getMessage";
    }
}
public class Custom_Exception_Classes {
    public static void main(String[] args) {
        My_exception m = new My_exception();
        System.out.println(m.getMessage());
        System.out.println(m.toString());
        int [] marks = new int[3];
        marks[0] = 43;
        marks[1] = 54;
        marks[2] = 89;
        Scanner s = new Scanner(System.in);
        int ind = s.nextInt();

        Scanner sx = new Scanner(System.in);
        int num = sx.nextInt();

        My_exception me = new My_exception();
        try {
            System.out.println("The index is : " + ind);
            System.out.println("The number is : " + marks[ind]/num);
            throw new ArithmeticException();

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Failed , Reason : " + e);
        }
        System.out.println("Program is executed");
    }
}
