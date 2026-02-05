package com.learner.lld.basics_if_else;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcateTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        String collect = Stream.of(A, B)
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(collect);

        String [] str = {"Apple", "Bannana", "Pinapple", "Mango"};

        List<String> list = Arrays.asList(str);
        String collect1 = list.stream().collect(Collectors.joining(","));
        System.out.println(collect1);



    }
}
