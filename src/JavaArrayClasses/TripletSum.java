package JavaArrayClasses;

import java.util.Scanner;

import static JavaArrayClasses.MinimumElementInAnArray.printArray;

public class TripletSum {

    public static void tripletSum(int [] arr, int sum){

        int n = arr.length;

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){

                    if(arr[i] + arr[j] + arr[k] == sum)
                        System.out.println(arr[i] + " " +  arr[j] + " " +  arr[k]);
                }
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

        System.out.println("Enter the Sum ");
        int sum = s.nextInt();

        System.out.println("Printing the Array Elements");

        printArray(arr);

        System.out.println("The Triplets are ");
        tripletSum(arr, sum);


    }
}
