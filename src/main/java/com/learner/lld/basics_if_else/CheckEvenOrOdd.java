package com.learner.lld.basics_if_else;

import java.util.Scanner;
import java.util.function.Function;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Function<Integer, Integer> f = num -> num%2 == 0 ? 0 : 1;
        System.out.println(f.apply(n));
    }
}
