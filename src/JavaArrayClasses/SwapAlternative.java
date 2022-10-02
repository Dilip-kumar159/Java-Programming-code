package JavaArrayClasses;

import java.util.Scanner;

import static JavaArrayClasses.MinimumElementInAnArray.printArray;

public class SwapAlternative {

    public static void swapAlternative(int []arr){

        int n = arr.length;

        for(int i=0; i<n; i += 2 ){
            if(i+1 < n){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
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

        System.out.println("Before Swapping Alternative");
        printArray(arr);
        swapAlternative(arr);
        System.out.println("After Swapping Alternative");
        printArray(arr);
    }
}
