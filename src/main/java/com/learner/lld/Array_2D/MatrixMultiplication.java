package com.learner.lld.Array_2D;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                A[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] B = new int[x][y];
        for(int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                B[i][j] = sc.nextInt();
            }
        }
        if (m != x) {
            System.out.println("Multiplication is not possible");
        }else {
            printMatrices(A, B);
        }
    }

    private static void printMatrices(int[][] A, int[][] B) {
        int n = A.length;
        int m = A[0].length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        int x = B.length;
        int y = B[0].length;
        for(int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
        checkIdentity(A,B);
    }

    private static void checkIdentity(int[][] A, int[][] B) {
        int n = A.length;
        int m = A[0].length;
        int x = B.length;
        int y = B[0].length;
        int[][] multiArr = new int[m][x];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < y; j++) {
                    int sum = 0;
                    for(int k = 0; k<m; k++){
                        multiArr[i][j] = A[i][k] * B[k][j];
                        sum = sum + multiArr[i][j];
                    }
                    multiArr[i][j] = sum;
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < y; j++) {
                    System.out.print(multiArr[i][j] + " ");
                }
                System.out.println();
            }

        }

    }

