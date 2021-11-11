package com.company;

public class Arrays {
    public static void main(String[] args) {
        /* Creation of array
        int [] marks = new int[5];
        marks[0] = 90;
        marks[1] = 48;
        marks[2] = 94;
        marks[3] = 89;
        marks[4] = 73;
        System.out.println(marks[4]);

        int [] marks = {90,48,94,89,73};
        System.out.println("Length of the Array: " + marks.length);
        // for traversing element in an array
        for (int i=0; i<marks.length; i++)
        {
            System.out.printf("%d ",marks[i]);
        }



        // Quick Quiz
        // Print the elements in an array in reverse order
        int [] marks = {90,48,94,89,73};
        System.out.println("Before reversing the array elements");
        for (int i=0; i<marks.length; i++)
        {
            System.out.printf("%d ",marks[i]);
        }
        System.out.println("\nAfter reversing the array elements");
        for (int i=marks.length-1; i>=0; i--)
        {
            System.out.printf("%d ",marks[i]);
        }

        // Creating a for-each loop
        int[] marks = {100, 90, 80, 70, 60, 50};
        for (int element : marks) {
            System.out.printf("%d ", element);
        }

         */
        // Creation of 2D- Array
//        int [][] arr = new int[2][3];
         int [][] arr = {{100,101,102},{201,202,203}};
        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr[i].length; j++)
            {
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
    }
}
