package com.company;

/** This is javadocs is to show how the add function works in this class,
 * and it reflects to java industry.
 * This is <i>italic</i> word<p>This is a new paragraph</p>
 * @author Dilip
 * @version 0.1
 * @see <a href = "https://docs.oracle.com/en/java/javase/14/docs/api/index.html">java_docs</a>
 * @since 2001
 */

public class Advance_Java_Docs {
    /**
     * Advance_Java_Docs is a constructor which as no parameters so , it is called default constructor.
     */
      public Advance_Java_Docs(){
        System.out.println("This is a constructor class of Advance_Java_Docs class");
    }
    /**
     *
     * @param a  It is a first Integer number to add.
     * @param b  It is a second Integer number to add.
     * @return  It is to return Integer number after adding first and second number.
     * @throws   Exception , if 'a' is 0.
     * @deprecated  This Add() method is deprecated , no more use in Java Industry.
     */
    public int add(int a, int b) throws Exception{
        if (a == 0) {
            throw new Exception();
        }
        return a+b;
//        System.out.println("Sum is : " + a+b);
    }

    /**
     *
     * @param args --> This is a main method which the execution of the program starts here itself in Java.
     */
    public static void main(String[] args) {
        System.out.println("This is a main method in the Advance Java Documentation");
    }
}
