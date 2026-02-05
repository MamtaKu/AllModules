package com.learner.lld.arrayList;

import java.util.Scanner;

public class TargetSumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        getTargetSumPair(arr,k);
    }

    private static void getTargetSumPair(int[] arr, int k) {
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++)
            if(arr[i]+arr[j] == k){
                System.out.println(i+","+j);
            }
        }
    }
}
