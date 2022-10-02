package com.company;



public class LinearSearch {
    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

     static int search(int arr[], int size, int element){
        for (int i=0; i<size; i++){
            if(arr[i] == element) {
                return 1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {


//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the size of the array : ");
//        int size = s.nextInt();
        int [] arr = new int[50];
        arr = new int[]{90,20,70,10,50};
        int element = 10;
        printArray(arr,5);
        int found = search(arr,5,element);

        if(found==1){
            System.out.println("Element " + element + " is present in the array");
        }
        else{
            System.out.println("Element " + element + " is not present in the array");
        }

    }

}
