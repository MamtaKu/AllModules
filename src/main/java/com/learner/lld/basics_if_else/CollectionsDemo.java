package com.learner.lld.basics_if_else;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 2, 13, 4, 50);
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println("After shuffling");
        Collections.shuffle(list1);
        System.out.println(list1);
    }
}