package com.company;

public class Variable_Arguments {
    static int sum(int...arr)
    {
        int result = 0;
        for (int element : arr)
        {
            result += element;
        }
        return result;
    }

//    static int sum(int a,int...arr)
//    {
//        int result = 0;
//        for (int element : arr)
//        {
//            result += element;
//        }
//        return result;
//    }
    public static void main(String[] args) {
        // Now here already varargs method is created so we can pass n number of arguments
        // In this case empty parameters won't work because in varargs method atleast one arguments is required.
        System.out.println("The sum of a and b is : " + sum()); // output is 0 because it can take empty
        System.out.println("The sum of a and b is : " + sum( 10,20));
        System.out.println("The sum of a,b and is : " + sum(10,20,30));
        System.out.println("The sum of a,b,c and d is : " + sum(10,20,30,40));
        System.out.println("The sum of a,b,c,d and e is : " + sum(10,20,30,40,50));


    }
}
