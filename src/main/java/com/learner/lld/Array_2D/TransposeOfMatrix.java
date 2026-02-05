package com.learner.lld.Array_2D;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        getTransposeOfMatrix(arr);
    }

    private static void getTransposeOfMatrix(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[][] transArr = new int[m][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                transArr[j][i] = arr[i][j];
            }
        }
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(transArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
