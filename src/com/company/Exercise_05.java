package com.company;

public class Exercise_05 {
    public static void main(String[] args) {
        // Problem 01
        // Pattern printing using for loop
//        int n=5;
//        for (int i=0; i<n; i++)
//        {
//            for (int j=i; j<n; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Problem 02
        // Sum of first n even numbers using while loop
//        int n=6;
//        int sum=0;
//        int i=1;
//        while (i<n){
//            System.out.println(2*i);
//            sum = sum +(2*i);
//            i++;
//        }
//      System.out.printf("Sum of first %d natural number is %d ",n,sum);

//        // Problem 03
//        // Multiplication of 10 using for loop
//        int n=10;
//        for (int i=1; i<=n; i++)
//        {
//            System.out.printf("%d X %d = %d\n",n,i,n*i);
//        }

        // Problem 04
        // Multiplication of 10 in reverse order using for loop
//        int n=10;
//        for (int i=n; i!=0; i--)
//        {
//            System.out.printf("%d X %d = %d\n",n,i,n*i);
//        }
//
        // Problem 05
        // Finding a factorial of a given number using for loop
//        // Factorial is 5! = 5*4*3*2*1 = 120
//        int n=6;
//        int fact = 1;
//        for (int i=1; i<=n; i++)
//        {
//            fact = fact * i;
//        }
//        System.out.printf("Factorial of %d is %d ",n,fact);
//        System.out.println(fact);

//       Problem 06
        // Finding a factorial of a given number using while loop
//        int n=5;
//        int i=1;
//        int fact=1;
//        while(i<=n)
//        {
//            fact *= i; // we can also write like this fact = fact * i.
//            i++;
//        }
//        System.out.printf("Factorial of %d is %d ",n,fact);

        // Problem 07
        // pattern printing using while loop
//        int i=1;
//        int n=5;
//        while(i<=n)
//        {
//            int j=1;
//            while(j<=n-i)
//            {
//                System.out.print(" ");
//                j++;
//            }
//            j=1;
//            while (j<=i)
//            {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
        // Problem 08
        // Finding the sum of n multiplication table using for loop.
//        int n=8;
//        int sum=0;
//        int i;
//        for (i=1; i<=10; i++)
//        {
//            System.out.printf("%d X %d = %d\n",n,i,n*i);
//            sum = sum + n*i;
//        }
//        System.out.printf("The sum of %d Multiplication table is %d",n,sum);

        // Problem 09
        // Sum of first n odd numbers using for loop
        int n=3;
        int sum = 0;
        for (int i=0; i<n; i++)
        {
            System.out.println(2*i+1);
            sum+=2*i+1;
        }
        System.out.printf("The sum of first %d odd numbers is : %d",n,sum);

    }
}
