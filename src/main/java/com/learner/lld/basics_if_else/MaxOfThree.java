package com.learner.lld.basics_if_else;

import java.util.Scanner;
import java.util.stream.Stream;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A == B && B == C){
            System.out.println("All numbers are equal. No unique maximum.");
        }
        else{
            Integer i = Stream.of(A, B, C)
                    .max(Integer::compare)
                    .get();
            System.out.println("The maximum number is " + i);
        }
    }
}
