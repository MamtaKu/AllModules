package com.learner.lld.array;

import java.util.Scanner;

public class EvenOddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 1; k <= t; k++){
            int n = sc.nextInt();
            int[] arr = new int[n];  // Declaration and Initialization of array
            for(int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();  // Taking input to array
            }
            getEvenOddElemetsDiff(arr);
        }

    }

    private static void getEvenOddElemetsDiff(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Difference between even and odd elements count: "+ Math.abs(evenCount - oddCount));
    }
}
