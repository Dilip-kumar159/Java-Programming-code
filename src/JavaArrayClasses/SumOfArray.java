package JavaArrayClasses;

import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {

        // Sum of All the elements in an array
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of the Array ");
        int size = s.nextInt(); // this line says that it is telling what is the size of the array.
        int [] arr = new int[size];

        System.out.println("Enter the array elements ");
        for(int i=0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }
        int ans = 0;

        for(int i=0; i<arr.length; i++){
//            ans = ans + arr[i];
            ans += arr[i]; // This is called Compound Assignment
        }

        System.out.println("The sum of All the elements in array is :  " + ans);



    }
}
