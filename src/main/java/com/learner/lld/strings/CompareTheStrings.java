package com.learner.lld.strings;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class CompareTheStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        Stream.of(str1, str2).sorted().forEach(System.out::println);
        int i = str1.compareTo(str2);
        System.out.println(i);
        char ch = 'd';
        char ch1 = 'm';
        System.out.println((int)ch);
        System.out.println((int)ch1);
        System.out.println((int)ch - (int)ch1);

        if(i == 0)
            System.out.println(0);
        else if(i >0)
            System.out.println(1);
        else
            System.out.println(-1);
    }
}
