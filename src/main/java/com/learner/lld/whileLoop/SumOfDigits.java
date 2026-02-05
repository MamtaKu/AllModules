package com.learner.lld.whileLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0){
            System.out.println(n);
            return;
        }
        n = Math.abs(n);
        List<Integer> digits = new ArrayList<>();
        while(n>0){
            digits.add(n%10);
            n = n/10;
        }
        int sum = digits.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

//        getSumOfDigits(n);
//    }
//
//    private static void getSumOfDigits(int n) {
//        int sum = 0;
//        while(n>0){
//            int r = n % 10;
//            n = n / 10;
//            sum = sum + r;
//            System.out.print(r +" \n");
//        }
//        System.out.println(sum);
//    }
    }
}
