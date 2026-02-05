package com.learner.lld.whileLoop;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrintMultiplesOf4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int i = 1;
//        while(i<=n){
//            if(i%4 == 0){
//                System.out.print(i+" ");
//            }
//            i++;
//        }
        IntStream.rangeClosed(1,n).filter(i -> i%4 == 0).forEach(i -> System.out.print(i+" "));
    }
}
