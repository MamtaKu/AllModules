package com.learner.lld.basics_if_else;

import java.util.Scanner;
import java.util.function.Function;

public class CategoriesTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        Function<Integer, Integer> f = num -> num > 0 ? 1 : num < 0 ? -1 : 0;
        System.out.println(f.apply(A));

    }
}
