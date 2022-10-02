package JavaArrayClasses;

import java.util.Scanner;

public class PairSum {

    public static void pairSum(int [] arr, int sum){

        int n = arr.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == sum) System.out.println(arr[i] + " " + arr[j]);
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

        pairSum(arr, sum);
    }
}
