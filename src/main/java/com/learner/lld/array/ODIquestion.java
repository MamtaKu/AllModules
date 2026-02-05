package com.learner.lld.array;

import java.util.Arrays;
import java.util.Scanner;

public class ODIquestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[7];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int total_runs = 0;
        for(int i = 0; i<arr.length; i++){
            total_runs += arr[i];
        }
        int avg = total_runs/7;
        System.out.println("Average runs scored in a week: " + avg);

        int highest_score = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > highest_score){
                highest_score = arr[i];
            }
        }
        System.out.println("Highest score in a week: " + highest_score);

        Arrays.sort(arr);
        int high = arr[0];
        System.out.println("Highest score is " + high);

    }
}
