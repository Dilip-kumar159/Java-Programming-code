package com.company;

public class Exception_try_catch_block {
    public static void main(String[] args) {
        int a = 2000;
        int b = 0;
//        without using try-catch exceptions.
//        int c = a/b;
//        it produces an error.
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at com.company.Exception_try_catch_block.main(Exception_try_catch_block.java:8)



//        with using try-catch exceptions
        try{
            int c = a/b;
            System.out.println("The result is : " + c);
        }
        catch (Exception e){
            System.out.println("Failed to produce output , Reason is : " + e);
        }
        System.out.println("Program ends");
        // it tries to run the program and handle the exceptions
//        Failed to produce output , Reason is : java.lang.ArithmeticException: / by zero
//        Program ends
    }
}
