package com.learner.lld.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DivisibleBy5And7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            list.add(sc.nextInt());
        }
        List<Integer> collect = list.stream().filter(i -> i % 5 == 0 && i % 7 == 0).collect(Collectors.toList());
        System.out.println(collect);

        getEleDivisibleBy5And7(list);
    }

    private static void getEleDivisibleBy5And7(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for(int i = 0; i<list.size(); i++){
            if(list.get(i)%5 == 0 && list.get(i)%7 == 0){
                newList.add(list.get(i));
            }
        }
        System.out.println(newList);
    }
}
