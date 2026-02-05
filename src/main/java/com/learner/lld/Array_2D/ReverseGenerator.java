package com.learner.lld.Array_2D;

import java.util.Scanner;

public class ReverseGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] A = new int[n];
        for(int i = 0; i<n; i++){
            A[i] = sc.nextInt();
        }
        reverseArray(A);
    }

    private static void reverseArray(int[] A) {
        for(int i = 0; i<A.length/2; i++){
            int temp = A[i];
               A[i] = A[A.length -i -1];
               A[A.length -1 -i] = temp;
        }

        for(int i = 0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
    }

}

