package com.learner.lld.Array_2D;

import java.util.Scanner;

public class CreateAndPrint2DArrayRow_wise {
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
        printRow_wiseMatrix(arr);
    }

    private static void printRow_wiseMatrix(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
