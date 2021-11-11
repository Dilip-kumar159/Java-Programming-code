package com.company;

public class Exercise_07 {
    static void multiplication(int n){
        for (int i=1; i<=10; i++)
        {
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
    static void pattern1(int n)
    {
        for(int i=0; i<n; i++)
        {
            for (int j=0; j<i; j++)
            {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    // sum(n) = 1 + 2 + 3 + 4 + 5
    // sum(5) = sum(n-1) + n
            //  sum(5-1) + 5
            //  sum(4-1) + 5
            //  sum(3-1) + 5
            //  sum(2-1) + 5

    static int sum(int n)
    {
        if (n==1){  // Base Condition
            return 1;
        }
        return n + sum(n-1);  // Recursive Condition
    }

    static void pattern2(int n)
    {
        for (int i=0; i<n; i++){
            for (int j=i; j<n; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    static int fibo(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
             return fibo(n-1) + fibo(n-2);
        }
    }
    static int var(int...arr){
        int sum=0;
        for (int element : arr) {
            sum += element;
        }
        int avg = sum/ arr.length;
        return avg;
    }
    static void pattern1_rec(int n){
        if (n > 0){
            pattern1_rec(n-1);
            for (int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Problem 01
        // Multiplication table
//        multiplication(7);
//        multiplication(2);

        // Problem 02
//        pattern1(10);

        // Problem 03
        // Find the sum of n natural number using recursion method
//        int n = 5;
//        int x = 10;
//        System.out.printf("The sum of first %d natural number is %d \n",n,sum(n));
//        System.out.printf("The sum of first %d natural number is %d ",x,sum(x));

        // Problem 04
//        pattern2(7);

        // Problem 05
        // finding the nth term of fibonacci series
        // fibonacci series = 0 1 1 2 3 5 8 13 21 34 55
//        int f = fibo(11); // 11th term is 55
//        System.out.println(f);

        // Problem 06
        // find the average of set of numbers passed as arguments
//       int l =  var(10,10);
//        int x =  var(10,20,30);
//
//        System.out.println("avg : " + l);
//        System.out.println("avg : " + x);

        // Problem 07
        // Pattern printing using recursion
         pattern1_rec(6);
    }
}
