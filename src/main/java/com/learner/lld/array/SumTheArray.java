package com.learner.lld.array;

import java.util.Arrays;
import java.util.Scanner;

public class SumTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];


//        int sum = 0;
//        for(int i = 0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//            sum = sum + arr[i];
//        }
//        System.out.println("Sum of array elements: " + sum);

//        int sum = Arrays.stream(arr).map(i -> sc.nextInt()).sum();
//        System.out.println("Sum of array elements: " + sum);
//
//        Arrays.stream(arr).map(i -> sc.nextInt()).sum().forEach(System.out::println);


        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum of array elements: " + sum);
    }
}
