package com.learner.lld.arrayList;

import java.util.Scanner;

public class PrefixSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int [] sumArray = getSumArray(arr);
        for(int i = 0; i<sumArray.length; i++){
            System.out.print(sumArray[i]+" ");
        }
    }
    private static int [] getSumArray(int[] arr) {
        int [] newArr = new int[arr.length];
        newArr[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            newArr[i] = newArr[i-1]+ arr[i];
        }
        return newArr;
    }
}
