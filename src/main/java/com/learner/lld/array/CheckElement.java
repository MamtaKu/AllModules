package com.learner.lld.array;

import java.util.Scanner;

public class CheckElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];  // Declaration and Initialization of array
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(checkElementIsPresent(arr,k));
    }
    public static boolean checkElementIsPresent(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return true;
            }
        }
        return false;
    }
}
