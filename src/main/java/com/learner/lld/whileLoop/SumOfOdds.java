package com.learner.lld.whileLoop;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOfOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum1 = IntStream.rangeClosed(1, n)
                .filter(k -> k % 2 != 0)
                .peek(x -> System.out.print(x +" "))
                .sum();
        System.out.println("\n"+ sum1);

//        int i = 1;
//        int sum = 0;
//        while(i<=n){
//            if(i%2 != 0){
//                sum = sum + i;
//                System.out.print(i+" ");
//            }
//            i++;
//        }
//        System.out.println();
//        System.out.println(sum);
    }
}
