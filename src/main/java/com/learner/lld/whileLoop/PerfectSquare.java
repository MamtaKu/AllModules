package com.learner.lld.whileLoop;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        IntStream.rangeClosed(1, (int) Math.sqrt(n)).map(i -> i*i).forEach(i -> System.out.print(i+" "));
        getPerfectSquareNumber(n);
    }
    private static void getPerfectSquareNumber(int n) {
        int i = 1;
        while(i*i<=n ){
            System.out.print(i*i+" ");
            i++;
        }
    }
}
