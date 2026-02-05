package com.learner.lld.array;

import java.util.Scanner;

public class NegativeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int N = sc.nextInt();
        int [] A = new int[N];
        for(int i = 0; i<A.length; i++){
            A[i] = sc.nextInt();
        }
        getNegativeNumbers(A);
    }
    public static void getNegativeNumbers(int [] A){
        for(int i = 0; i<A.length; i++){
            if(A[i] < 0){
                System.out.print(A[i] + " ");
            }
        }
    }
}
