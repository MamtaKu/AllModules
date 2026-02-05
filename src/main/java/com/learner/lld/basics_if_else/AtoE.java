package com.learner.lld.basics_if_else;

import java.util.stream.IntStream;

public class AtoE {
    public static void main(String[] args) {
        IntStream.rangeClosed('A','E')
                .mapToObj(c -> (char)c)
                .forEach(System.out::println);
    }
}
