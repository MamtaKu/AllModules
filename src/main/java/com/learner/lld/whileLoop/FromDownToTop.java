package com.learner.lld.whileLoop;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FromDownToTop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        while(n>0){
//            System.out.print(n +" ");
//            n--;
//        }

        IntStream.rangeClosed(1,n).map(k -> n - k + 1).forEach(x -> System.out.print(x+" "));
    }
}
