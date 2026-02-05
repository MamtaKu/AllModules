package com.learner.lld.array;

import java.util.Scanner;

public class SeperateOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int k = 1; k <= t; k++) {
            int n = sc.nextInt();
            int[] arr = new int[n]; // Declaration and Initialization of array
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();  // Taking input to array
            }
            getOddEven(arr);
        }

    }

    private static void getOddEven(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                System.out.print(arr[i] +" ");
            }
        }
        System.out.println();
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                System.out.print(arr[i] +" ");
            }
        }
    }
}
