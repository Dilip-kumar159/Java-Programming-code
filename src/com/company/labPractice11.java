package com.company;

import java.util.Scanner;

public class labPractice11 {

    public static void printMatrix(int rows, int cols, int [][] matrix){

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumMatrix(int rows, int cols, int [][]matrix1, int [][] matrix2, int [][] sum){

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Program to demonstrate the Matrix Addition
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Rows : ");
        int rows = scanner.nextInt();

        System.out.println("Enter the Columns : ");
        int cols = scanner.nextInt();

        int [][] matrix1 = new int[rows][cols];
        int [][] matrix2 = new int[rows][cols];
        int [][] sum = new int[rows][cols];

        // Taking input from the user for matrix1
        System.out.println("Enter the First Matrix");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Taking input from the user for matrix2
        System.out.println("Enter the Second Matrix");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // for displaying the matrix1
        System.out.println("First Matrix");
        printMatrix(rows, cols, matrix1);
        // for displaying the matrix2
        System.out.println("Second Matrix");
        printMatrix(rows, cols, matrix2);

        // for displaying the sum of two matrix
        System.out.println("Addition of Two Matrix ");
        sumMatrix(rows,cols,matrix1, matrix2, sum);

    }
}
