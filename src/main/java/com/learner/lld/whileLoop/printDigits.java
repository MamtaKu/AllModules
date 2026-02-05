package com.learner.lld.whileLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class printDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(0);
            return;
        }

        n = Math.abs(n);
        List<Integer> digits = new ArrayList<>();
        while(n>0){
            digits.add(n%10);
            n = n/10;
        }
        //Collections.reverse(digits);
        String collect = digits.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(collect);



//        printDigits(n);
//    }
//    public static void printDigits(int n){
//        while(n>0){
//            int r = n%10;
//            System.out.println(r);
//            n = n/10;
        //}
    }
}
