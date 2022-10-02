package JavaArrayClasses;

import java.util.Scanner;

public class MinimumElementInAnArray {

    public static void printArray(int []arr){

        int n = arr.length;

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int minimumElement(int [] arr){

        int min = Integer.MAX_VALUE;

        for(int i=0; i< arr.length; i++){

            // Checking at each index whether it is a minimum element or not
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Size of the Array ");

        int size = s.nextInt(); // this line says that it is telling what is the size of the array.
        int [] arr = new int[size];

        System.out.println("Enter the array elements ");
        for(int i=0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Printing the Array Elements");

        printArray(arr);

        int ans = minimumElement(arr);

        System.out.println("Minimum Element in an Array is : " + ans);

    }
}
