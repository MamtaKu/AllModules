package com.learner.lld.dataTypes;

import java.util.Scanner;

public class DataTypesBasedQuiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1000000;
        int b = 40000000;
        int result1 = a*b;
        long result = (long)(a*b);
        System.out.println(result);
        System.out.println(result1);
    }
}
