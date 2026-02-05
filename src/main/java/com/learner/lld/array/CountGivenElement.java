package com.learner.lld.array;

import java.util.Scanner;

public class CountGivenElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];  // Declaration and Initialization of array
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();  // Taking input to array
        }
        int k = sc.nextInt();
        System.out.println(countOccurrences(arr, k));
    }
    public static int countOccurrences(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                count++;
            }
        }
        return count;
    }
}
