package com.company;

public class BinarySearch {

    static void printArray(int [] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int binarySearch(int[] arr, int key){
        int start = 0;
        int end = 6 - 1;
        int mid = start + (end-start)/2;
        while(start <= end){
            if(arr[mid] == key){
                return mid;
            }
            else if(key > arr[mid]){
                start = mid + 1;
            }
            else{  // key < arr[mid]
                end = mid - 1;
            }
            mid = start + (end - start)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{10,20,30,40,50,60};
        printArray(arr,6);
        int key = 100;
        int index = binarySearch(arr, key);
        System.out.println("The element " + key + " is present in the index " + index);
    }
}
