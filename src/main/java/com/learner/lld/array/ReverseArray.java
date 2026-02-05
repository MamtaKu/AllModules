package com.learner.lld.array;

public class ReverseArray {
    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4, 5};
        reverseArray(A);
    }

    private static void reverseArray(int[] A) {
        for(int i = 0; i<A.length/2; i++){
            int temp  = A[i];
            A[i] = A[A.length-i-1];
            A[A.length-i-1] = temp;
        }
        for(int i = 0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
    }
}
