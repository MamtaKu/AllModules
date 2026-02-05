package com.learner.lld.basics_if_else;

import java.util.Scanner;
import java.util.function.Consumer;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A+B +", "+ A*B + ", " + (A-B) +", "+ A/B);

        Consumer<Integer> f = System.out::println;
        f.accept(A+B);
        f.accept(A*B);
        f.accept(A-B);
        f.accept(A/B);

    }
}
