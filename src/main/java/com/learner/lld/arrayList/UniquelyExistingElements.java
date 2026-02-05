package com.learner.lld.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniquelyExistingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            list.add(sc.nextInt());
        }
        Map<Integer, Long> collect =
                list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Integer> uniqueElements = collect.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        if(uniqueElements.isEmpty()){
            System.out.println("No Unique elemnet found");
        }
        else{
            uniqueElements.forEach(System.out::println);
        }

        uniquelyExistingElements(list);
    }

    private static void uniquelyExistingElements(List<Integer> list) {
        for(int i = 0; i<list.size(); i++){
            int count = 0;
            for(int j = 0; j<list.size(); j++){
                if(list.get(i) == list.get(j)){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(list.get(i)+ " ");
            }
        }
    }
}
