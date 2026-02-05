package com.learner.lld.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SearchAllOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        IntStream.range(0, str.length()).filter(i -> str.charAt(i) == k).forEach(i -> System.out.print(i+", "));
        List<Integer> collect = IntStream.range(0, str.length()).filter(i -> str.charAt(i) == k).boxed().collect(Collectors.toList());
        System.out.println(collect);


        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == k){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
