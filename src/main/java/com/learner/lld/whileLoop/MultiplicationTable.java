package com.learner.lld.whileLoop;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        int i = 1;
//
//        while(i<=10) {
//            System.out.println(n + " * " + i + " = " + n * i);
//            i++;
//        }

        IntStream.rangeClosed(1,10).forEach(k -> System.out.println(n +" * " + k +" = " + (n*k)));
    }
}
