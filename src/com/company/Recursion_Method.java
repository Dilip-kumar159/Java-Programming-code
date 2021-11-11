package com.company;

public class Recursion_Method {
    // Find a factorial of a given n number using recursion method
    // Basically factorial means factorial(n) = n * (n-1)....1.
    // we can also say factorial(n) = n * factorial(n-1)
    static int factorial(int n)
    {
        if (n==0 || n==1) // Base condition
        {
            return 1;
        }
        else {
            return n * factorial(n-1); // Recursive condition
        }
    }

    // Factorial of a given n number using iterative approach
//    static int factorial(int n) {
//        int fact = 1;
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            for (int i = 1; i <= n; i++) {
//                fact *= i;
//            }
//            return fact;
//        }
//    }
        public static void main (String[]args){
            int x = 5;
            int y = 1;
            int z = 0;
            System.out.printf("The factorial of %d is %d\n", x, factorial(x));
            System.out.printf("The factorial of %d is %d\n", y, factorial(y));
            System.out.printf("The factorial of %d is %d\n", z, factorial(z));
        }
}
