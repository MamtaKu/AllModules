package com.learner.lld.whileLoop;

import java.util.Scanner;
import java.util.stream.IntStream;

public class print1to100Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
//        int i = 1; //Initialization
//        while(i<=n){
//            System.out.print(i +" "); //Logic
//            i++;
//        }
//        System.out.println("");

        IntStream.rangeClosed(1, n).forEach(k -> System.out.print(k+" "));
    }
}
