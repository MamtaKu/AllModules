package com.learner.lld.array;

import java.util.Scanner;

public class CopyTheArray {
    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4, 5};
        int B = 3;
        int newArr[] = new int[A.length];
        for(int i = 0; i<A.length; i++){
            newArr[i] = A[i] + B;
            System.out.print(newArr[i] +" ");
        }
    }
}
