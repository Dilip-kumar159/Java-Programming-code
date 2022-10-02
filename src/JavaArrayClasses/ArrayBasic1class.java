package JavaArrayClasses;

import java.util.Scanner;

public class ArrayBasic1class {

    public static void main(String[] args) {
        // I told that I have 5 size of array

//        int [] arr = new int[8]; // if you see new keyword then it is a dynamic memory allocation
//
//        arr[0] = 10;
//        arr[1] = 4;
//        arr[2] = 3;
//        arr[3] = 5;
//        arr[4] = 13;
//        arr[5] = 199;
//        arr[6] = 230;
//        arr[7] = 39;


    // I want generic code
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of the array ");
        int size = s.nextInt();

        int [] arr = new int[size];

        // for taking input we use for loop
        System.out.println("The Elements are ");
        for(int i=0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }

        // for printing the array
        System.out.println("Printing the Array elements");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
//
//        System.out.println(arr[0]); // It is showing the value
//        System.out.println(arr);
//
////        arr[5] = 23; This is not acceptable

    }

}
