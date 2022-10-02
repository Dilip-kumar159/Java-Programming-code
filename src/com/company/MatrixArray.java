package com.company;

import java.util.Scanner;

public class MatrixArray {

    static void matrix(int [][] matrix, int rows ,int columns){
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void sum(int [][] sum, int rows, int columns, int [][] matrix1, int [][] matrix2){
        System.out.println("The sum of two Matrix is ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void sub(int [][] sub, int rows, int columns, int [][] matrix1, int [][] matrix2, int [][] matrix3){
        System.out.println("The Subtraction of two Matrix is ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                sub[i][j] = matrix1[i][j] - matrix2[i][j] - matrix3[i][j];
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows ");
        int rows = sc.nextInt();

        System.out.println("Enter the columns ");
        int columns = sc.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] matrix3 = new int[rows][columns];
        int[][] sum = new int[rows][columns];
        int[][] sub = new int[rows][columns];

        System.out.println("Enter the first Matrix data ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the Second Matrix data ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

//        System.out.println("Enter the Third Matrix data ");
//        for(int i=0; i<rows; i++){
//            for(int j=0; j<columns; j++){
//                matrix3[i][j] = sc.nextInt();
//            }
//        }

        System.out.println("The First Matrix data ");
        matrix(matrix1,rows,columns);

        System.out.println("The Second Matrix data ");
        matrix(matrix2,rows,columns);

//        System.out.println("The Third Matrix data ");
//        matrix(matrix3,rows,columns);

        sum(sum,rows,columns,matrix1,matrix2);

//        sub(sub,rows,columns,matrix1,matrix2,matrix3);

//        System.out.println("The Multiplication of two Matrix is ");
//        for(int i=0; i<rows; i++){
//            for(int j=0; j<columns; j++){
//                sum[i][j] = matrix1[i][j] * matrix2[i][j] * matrix3[i][j];
//                System.out.print(sum[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
