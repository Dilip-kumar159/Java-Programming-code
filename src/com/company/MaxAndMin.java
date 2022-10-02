package com.company;

public class MaxAndMin {

    static void maxAndMin(int [] arr, int n){

        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<n; i++){

            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Maximum Element is : " + max);
        System.out.println("Minimum Element is : " + min);
        System.out.println();

    }
    public static void main(String[] args) {

        int [] arr = {1,42,93,0,-323,-2,9};
        int n = 7;
        maxAndMin(arr,n);

        int [] arr1 = {2,34,432,-893,784,1234};
        int n1 = 6;
        maxAndMin(arr1,n1);
    }
}
