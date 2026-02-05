package com.learner.lld.basics_if_else;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];
        for(int i = 0; i<5; i++){
            array[i] = sc.nextInt();
        }

        double v = Arrays.stream(array)
                .average()
                .orElse(0);
        System.out.println(v);

    }
}
