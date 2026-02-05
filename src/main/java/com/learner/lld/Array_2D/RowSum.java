package com.learner.lld.Array_2D;

import java.util.Scanner;

public class RowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        getSum(matrix);
    }

    private static void getSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int [] rowSum = new int[n];

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum  = sum + matrix[i][j];
            }
            rowSum[i] = sum;
        }

        for(int i = 0; i<n; i++){
            System.out.print(rowSum[i]+" ");
        }
    }
}