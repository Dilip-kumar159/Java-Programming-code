package JavaArrayClasses;

import java.util.Scanner;

import static JavaArrayClasses.MinimumElementInAnArray.printArray;

public class ReverseArray {

    public static void reverseArray(int [] arr){

        int n = arr.length;

        for(int i = n - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
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

        System.out.println("Before Traversing ");
        printArray(arr);

        System.out.println("After Traversing");

        reverseArray(arr);

    }
}
