package com.company;

public class All_types_of_Loops {
    public static void main(String[] args) {
        // While Loops
//        Quick Quiz 1
//         Print natural numbers from 100 to 200
//        int i = 100;
//        while (i <= 200)
//        {
//            System.out.println(i);
//            i++;
//        }

        // do while loops
//        int i = 10;
//        do {
//            System.out.println(i);
//            i++;
//        }while (i<6); // Eventhough the while condition is false, do while loops executes at least once.

        // do while loops
//        Quick Quiz 2
        //     Print natural numbers from 1 to 5
        //     int i=1;
//         int n=5;
//         do {
//             System.out.println(i);
//             i++;
//         }while (i<=n);

        // for loops
        // Quick Quiz 3
        // finding the odd numbers from 0 to n.
//        int n = 5;
//        for (int i = 0; i < n; i++)
//        {
//            System.out.println(2*i+1); prints 1 3 5 7 9
//        }
//
        // Quick Quiz 4
        // Decrementing the odd numbers from n to 0.
//        int n = 5;
//        for (int i=n; i>0; i--)
//        {
//            System.out.println(2*i-1); // prints 9 7 5 3 1
//        }

        // Break Keyword
//        for(int i=1; i<10; i++)
//        {
//            System.out.println(i);
//            if (i == 7)
//            {
//                break;
//            }
//        }

        // Continue Keyword
        for(int i=1; i<10; i++)
        {
            if (i == 7)
            {
              continue;
            }
            System.out.println(i);
        }
    }
}
