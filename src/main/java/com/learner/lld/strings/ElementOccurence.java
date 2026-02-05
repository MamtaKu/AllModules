package com.learner.lld.strings;

import java.util.Map;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ElementOccurence {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 2, 3, 5, 1};
        Map<Integer, Long> map = Arrays.stream(input).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
