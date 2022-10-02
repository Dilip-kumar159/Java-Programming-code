package JavaArrayClasses;

import java.util.Scanner;

import static JavaArrayClasses.MinimumElementInAnArray.printArray;

public class Sort0and1 {

    public static void sort(int [] arr){

        int [] temp = new int[arr.length];

        int k = 0;

        // This is for 0
        for(int i=0; i< arr.length; i++){
            if(arr[i] == 0){
                temp[k] = arr[i];
                k++;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                temp[k] = arr[i];
                k++;
            }
        }

        // For Printing
        printArray(temp);
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

        printArray(arr);
        sort(arr);

    }
}
