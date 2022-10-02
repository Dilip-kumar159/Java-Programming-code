package com.company;

import java.util.Scanner;

public class labPractice15 {

    public static void printMatrix(int rows, int cols, int [][] matrix){
        for(int i=0; i< rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Rows ");
        int rows = scanner.nextInt();

        System.out.println("Enter the columns");
        int cols = scanner.nextInt();

        int [][] matrix1 = new int[rows][cols];
        int [][] matrix2 = new int[rows][cols];
        int [][] sum = new int[rows][cols];

        // For Taking input from the user first matrix
        System.out.println("Enter the First Matrix");
        for(int i=0; i< rows; i++){
            for(int j=0; j<cols; j++){
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // For Taking input from the user for second matrix
        System.out.println("Enter the Second Matrix");
        for(int i=0; i< rows; i++){
            for(int j=0; j<cols; j++){
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // displaying the matrix1
        System.out.println("First Matrix");
        printMatrix(rows, cols, matrix1);

        // Displaying the matrix2
        System.out.println("Second Matrix");
        printMatrix(rows, cols, matrix2);

        // displaying the matrix Multiplication
        System.out.println("Multiplication of Two Matrix");
//        mulMatrix(rows, cols, matrix1, matrix2, sum);
        for(int i=0; i< rows; i++){
            for(int j=0; j<cols; j++){
                for(int k=0; k<cols; k++){
                    sum[i][j] = sum[i][j] + (matrix1[i][k] * matrix2[k][j]);
                }
            }
        }

        // for printing
        for(int i=0; i< rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
