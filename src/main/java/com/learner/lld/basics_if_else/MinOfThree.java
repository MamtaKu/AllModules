package com.learner.lld.basics_if_else;

import java.util.Scanner;
import java.util.stream.Stream;

public class MinOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A==B &&B==C){
            System.out.println("All three numbers are equal: " + A);
        }
        else {
            Integer i = Stream.of(A, B, C)
                    .min(Integer::compareTo)
                    .get();
            System.out.println("The minimum number among A, B and C is: " + i);
        }

    }
}
