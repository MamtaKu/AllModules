package com.learner.lld.array;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 1; k <= t; k++){
            int n = sc.nextInt();
            int b = sc.nextInt();
            int[] arr = new int[n];  // Declaration and Initialization of array
            for(int i = 0; i<arr.length; i++) {
                arr[i] = sc.nextInt();  // Taking input to array
            }
            System.out.println(checkElementisPresent(arr,b));
        }

    }

    private static int checkElementisPresent(int[] arr, int b) {
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == b){
                return 1;
            }
        }
        return 0;
    }

}
