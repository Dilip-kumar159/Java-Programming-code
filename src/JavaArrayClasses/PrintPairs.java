package JavaArrayClasses;

import java.util.Scanner;

public class PrintPairs {

    public static void printPairs(int [] arr){

        int n = arr.length;

        for(int i = 0; i<n; i++){
            for(int j=i+1; j<n; j++){
                System.out.println(arr[i] + " , " + arr[j]);
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

        printPairs(arr);
    }
}
