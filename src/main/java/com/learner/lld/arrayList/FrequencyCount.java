package com.learner.lld.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1, 2, 3, 1, 4};
        getFrequencyCountArray(arr);
    }

    private static void getFrequencyCountArray(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            int count = 0;
            for(int j = 0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            list.add(count);
        }
        System.out.println(list);
    }
}
