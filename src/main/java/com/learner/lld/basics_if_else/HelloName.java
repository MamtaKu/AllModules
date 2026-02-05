package com.learner.lld.basics_if_else;

import java.util.Scanner;
import java.util.stream.Stream;

public class HelloName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Stream.of(s)
                .map(m -> "Hello " + m)
                .forEach(System.out::println);
    }
}
