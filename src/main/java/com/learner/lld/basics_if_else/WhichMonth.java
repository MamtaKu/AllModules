package com.learner.lld.basics_if_else;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class WhichMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        List<String> months = Arrays.asList("January","February","March","April","May","June",
                "July","August","September","October","November","December");

        Optional<String> first = IntStream.rangeClosed(1, 12)
                .filter(i -> i == A)
                .mapToObj(i -> months.get(A - 1))
                .findFirst();

        first.ifPresentOrElse(m -> System.out.println(m), () -> System.out.println("Invalid MOnth Number"));
    }
}
