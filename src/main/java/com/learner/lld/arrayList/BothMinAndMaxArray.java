package com.learner.lld.arrayList;

import java.util.Scanner;

public class BothMinAndMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        getArrayOfMinAndMax(arr);

    }

    private static void getArrayOfMinAndMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int [] newArr = new int[2];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        newArr[0] = min;
        newArr[1] = max;
        for(int i = 0; i<2; i++){
            System.out.print(newArr[i]+" ");

        }
    }
}
