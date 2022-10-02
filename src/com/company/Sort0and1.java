package com.company;

public class Sort0and1 {
    static void printArray(int arr[],int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void sort(int arr[]){

        int l = 0;
        int r = arr.length-1;

        while(l < r){

            if(arr[l] == 0) l++;

            if(arr[r]  == 1) r--;

            else{
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
    }

    static void sortZeroOne(int arr[], int size) {
        int left = 0;
        int right = size - 1;
        while (left < right) {
            while (arr[left] == 0 && left < right) {
                left++;
            }
            while (arr[right] == 1 && left < right) {
                right--;
            }
            if (arr[left] == 1 && arr[right] == 0 && left < right) {
//                swap(arr[left], arr[right]);
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {

        int [] arr = new int[50];
        arr =  new int[]{0,1,1,1,0,0,0};
        System.out.println("Before Sorting");
        printArray(arr,7);
        System.out.println("After Sorting");
        sort(arr);
        printArray(arr,7);
    }
}
