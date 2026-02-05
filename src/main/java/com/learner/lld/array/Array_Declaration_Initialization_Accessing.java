package com.learner.lld.array;

import java.util.Scanner;

public class Array_Declaration_Initialization_Accessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];  // Declaration and Initialization of array

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();  // Taking input to array
        }
        //Accessing array elements
        System.out.println("Array elements are: ");
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
