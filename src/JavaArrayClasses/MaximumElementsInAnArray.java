package JavaArrayClasses;

import java.util.Scanner;

public class MaximumElementsInAnArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of the Array ");
        int size = s.nextInt(); // this line says that it is telling what is the size of the array.
        int [] arr = new int[size];

        System.out.println("Enter the array elements ");
        for(int i=0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max) {
                max = arr[i];
            }
        }
//        int max = Integer.MAX_VALUE;

        System.out.println("The maximum Element in An Array is : " + max);
    }
}
