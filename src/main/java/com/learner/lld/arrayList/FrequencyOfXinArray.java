package com.learner.lld.arrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfXinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        long count = Arrays.stream(arr).filter(i -> i == k).count();
        System.out.println(count);

        getFrequencyOfEle(arr,k);
    }

    private static void getFrequencyOfEle(int[] arr, int k) {
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==k){
                count++;
            }
        }
        System.out.println(count);
    }
}
