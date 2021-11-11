package com.company;


public class  Factorial_In_CondOP {
    public static int factorial(int n){
        return  (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int x = 5;
        x &= 6;
//        System.out.println(x);
//        int l = 5;
        System.out.println(factorial(5));
        System.out.println(factorial(6));
    }
}
