package com.company;

public class Exercise_06 {
    public static void main(String[] args) {
        // Problem 01
        // Create a  5 float arrays and calculate their sum.
     /*
        float [] arr = {89.4f,32.7f,53.8f,35.5f,23.8f};

        float sum = 0;
        for (int i=0; i<arr.length; i++)
        {
            sum = sum + arr[i];
        }
        System.out.printf("The sum of the float array is %.2f ",sum);

        // Problem 02
        // Check whether the given integer number is present in the array or not
        int [] arr = {10,20,39,40,50,60,70,80,90};
        int element = 73;
        boolean Isinarray = false;
        for (int i=0; i<arr.length; i++)
        {
            System.out.printf("%d ",arr[i]);
            if (arr[i]==element)
            {
                Isinarray = true;
                break;
            }
        }
        if (Isinarray == true)
        {
            System.out.printf("\nThe element %d is present in the array ",element);
        }
        else
        {
            System.out.printf("\nThe element %d is not present in the array ",element);

        }

        // Problem 03
        // Calculate the average of the 5 students of physics subject
        int [] arr = {82,65,79,90,98};
       int sum = 0;
       int n = 5;
        for (int element : arr)
        {
            sum = sum + element;
            System.out.printf("%d ",element);
        }
      float avg = (float) sum/n;
        System.out.printf("\nThe sum of the float array is %d ",sum);
        System.out.printf("\nThe average of the float array is %.3f ",avg);

        // Problem 04
        // Crete a 2D array and add two matrices of size 2x3.
        int [][] mat1 = {{3,5,6},{8,3,2}};
        int [][] mat2 = {{5,2,4},{2,2,3}};
        int [][] res = {{0,0,0},{0,0,0}};
        for (int i=0; i<mat1.length; i++)
        {
            for (int j=0; j< mat1[i].length; j++)
            {
                System.out.printf("Setting the i= %d and j= %d \n",i,j);
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        // for displaying the result of two matrix
        for (int i=0; i<mat1.length; i++)
        {
            for (int j=0; j< mat1[i].length; j++)
            {
                System.out.print(res[i][j] + " ");
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println();
        }

        // Problem 05
        // find the maximum number in the array
        int [] arr = {101,22020,30,4990,60,502};
        int max = Integer.MIN_VALUE;
        for (int e: arr)
        {
            if (e > max)
            {
                max = e;
            }
        }
        System.out.printf("The maximum element in the given array is %d ",max);

        // Problem 07
        // find the maximum number in the array
        int [] arr = {1,220,30,-4990,60,0};
        int min = Integer.MAX_VALUE;
        for (int e: arr)
        {
            if (e < min )
            {
             min = e;
            }
        }
        System.out.printf("The minimum element in the given array is %d ",min);
           */
        //problem 08
        // Check whether the given array is sorted or not
        int [] arr = {1,220,300,990,6890,18110};
        boolean issorted = true;
        for (int i=0; i<arr.length-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                issorted = false;
            }
        }
        if (issorted == true)
        {
            System.out.printf("The given array is sorted ");
        }
        else {
            System.out.printf("The given array is not sorted ");
        }

    }
}
