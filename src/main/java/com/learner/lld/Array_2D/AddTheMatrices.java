package com.learner.lld.Array_2D;

import java.util.Scanner;

public class AddTheMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int[][] B = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        printMatrix(A, B);

    }

    private static void printMatrix(int[][] A, int[][] B) {
        int n = A.length;
        int m = A[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        getTheSumMatrix(A, B);

    }

    private static void getTheSumMatrix(int[][] A, int[][] B) {
        int n = A.length;
        int m = A[0].length;
        int [][] sumArray = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumArray[i][j] = A[i][j]+B[i][j];
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(sumArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
    

    
