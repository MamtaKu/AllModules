package com.learner.lld.Array_2D;

import java.util.Scanner;

public class AreMatricesSame {
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
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] B = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
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
        int x = B.length;
        int y = B[0].length;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(checkMatrixAreSame(A, B));
    }

    private static int checkMatrixAreSame(int[][] A, int[][] B) {
        int n = A.length;
        int m = A[0].length;
        int x = B.length;
        int y = B[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] != B[i][j]) {
                    return 0;
                }
            }
        }
        return 1;
    }
}

