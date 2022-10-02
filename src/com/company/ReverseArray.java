package com.company;

public class ReverseArray {

    static void printArray(int [] arr, int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void reverse(int [] arr, int size){
        int start = 0;
        int end = size - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
            int [] arr = new int[]{50,40,30,20,10};
            System.out.println("Before Reversing the array");
            printArray(arr,5);
            System.out.println("After Reversing the array");
            reverse(arr,5);
            printArray(arr,5);
    }
}
