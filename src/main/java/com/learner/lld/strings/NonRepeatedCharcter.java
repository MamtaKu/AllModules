package com.learner.lld.strings;

import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

public class NonRepeatedCharcter {
    public static void main(String[] args) {
        String str = "mydad";
        LinkedHashMap<Character, Long> map = str.chars().mapToObj(c ->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
        List<Character> list = map.entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).collect(Collectors.toList());
        System.out.println(list);
    }
}
