package com.company;

public class MatrixMultiplication {
    public static void main(String[] args) {

        int [][] m1 = {{2,3}, {1,4}};
        int [][] m2= {{1,2},{6,1}};
        int [][] result = new int[2][2];


        // Printing first matrix
        System.out.println("First Matrix");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }

        
        // Printing Second matrix
        System.out.println("Second Matrix ");
        for(int i=0; i< 2; i++){
            for(int j=0; j<2; j++){
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }

        // matrix multiplication
        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                for(int k=0; k< 2; k++){
                    result[i][j] = result[i][j] + (m1[i][k] * m2[k][j]);
                }
            }
        }

        // Printing Resultant matrix
        System.out.println("The Resultant Matrix");
        for(int i=0; i< 2; i++){
            for(int j=0; j<2; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }


    }
}
