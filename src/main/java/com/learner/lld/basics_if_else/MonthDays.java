package com.learner.lld.basics_if_else;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 31);
        map.put(2, 29);
        map.put(3, 31);
        map.put(4, 30);
        map.put(5, 31);
        map.put(6, 30);
        map.put(7, 31);
        map.put(8, 31);
        map.put(9, 30);
        map.put(10, 31);
        map.put(11, 30);
        map.put(12, 31);

        Stream.of(A)
                .filter(map::containsKey)
                .map(map::get)
                .findFirst()
                .ifPresentOrElse(i -> System.out.println("Number of days in "+ A +"th Month is " + i), () -> System.out.println("Invlaid month number"));

    }
}
