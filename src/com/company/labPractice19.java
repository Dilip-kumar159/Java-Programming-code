package com.company;

public class labPractice19 {
    public static void main(String[] args) {

        try{
            int i = args.length;
            System.out.println("Arguments : " + i);
            int c = 40/i;
            int []a = {1};
            a[10] = 20;
        }
        catch (ArithmeticException e){
            System.out.println("Divide By Zero Exception");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Out Of Bound Exception");
        }
    }
}
