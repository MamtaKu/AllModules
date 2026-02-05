package com.learner.lld.strings;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringSum {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "456";
        System.out.println(str1+str2);  //this will connect the strings
        int stringSum = Integer.parseInt(str1)+ Integer.parseInt(str2);
        System.out.println(stringSum);


        Map<Integer, Set<String>> setByLength =
                Stream.of("bat","bat","bag","eag","balloon")
                        .collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(setByLength);

        Stream.of("bat","bat","bag","eag","balloon").collect(Collectors.groupingBy(String::length));

    }
}
