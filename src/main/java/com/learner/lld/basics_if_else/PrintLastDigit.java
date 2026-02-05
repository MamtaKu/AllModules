package com.learner.lld.basics_if_else;

import java.util.Scanner;
import java.util.stream.Stream;

public class PrintLastDigit {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int i = sc.nextInt();

        Stream.of(i)
                .map(j -> j%10)
                .forEach(System.out::println);
    }
}

