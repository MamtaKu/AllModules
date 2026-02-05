package com.learner.lld.array;

import java.util.Scanner;

public class MaxAndMinOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int N = sc.nextInt();
        int[] A = new int[N];  // Declaration and Initialization of array
        for(int i = 0; i<A.length; i++){
            A[i] = sc.nextInt();  // Taking input to array
        }
        findMinAndMax(A);
    }
    public static void findMinAndMax(int [] A){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<A.length; i++){
            if(A[i] > max){
                max = A[i];
            }
        }
        System.out.print(max +" ");
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<A.length; i++){
            if(A[i]<min){
                min = A[i];
            }
        }
        System.out.println(min);
    }
}
