package com.learner.lld.array;

import java.util.Scanner;

public class CheckIncreasingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];  // Declaration and Initialization of array
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();  // Taking input to array
        }
        System.out.println(isArrayInIncreasingOrder(arr));
    }
    public static boolean isArrayInIncreasingOrder(int[] arr){
        for(int i = 1; i<arr.length; i++) {
            if (arr[i-1] >= arr[i]) {
                return false;
            }
        }
            return true;
        }
}
