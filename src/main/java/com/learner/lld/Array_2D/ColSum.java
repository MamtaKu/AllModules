package com.learner.lld.Array_2D;

import java.util.Scanner;

public class ColSum {
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
        printMatrix(A);
    }

    private static void printMatrix(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        getColSum(A);
    }

    private static void getColSum(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int [] colSumArray = new int[m];
        for (int j = 0; j < m; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + A[i][j];
            }
            colSumArray[j] = sum;
        }
        for (int j = 0; j < m; j++){
            System.out.print(colSumArray[j]+" ");
        }
    }
}
