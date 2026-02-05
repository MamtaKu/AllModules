package com.learner.lld.basics_if_else;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MinTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int asInt = IntStream.of(A, B)
                .min()
                .getAsInt();
        System.out.println(asInt);

    }
}
