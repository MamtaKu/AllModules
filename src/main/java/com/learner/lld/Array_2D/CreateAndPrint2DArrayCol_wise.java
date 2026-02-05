package com.learner.lld.Array_2D;

import java.util.Scanner;

public class CreateAndPrint2DArrayCol_wise {
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
        printCol_wiseMatrix(arr);
    }

    private static void printCol_wiseMatrix(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for(int j = 0; j<m; j++){
            for(int i = 0; i<n; i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
