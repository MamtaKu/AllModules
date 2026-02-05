package com.learner.lld.practice;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) {
        List<Emp> employees = Arrays.asList(
                new Emp("Mamta", "HR", 35000),
                new Emp("Rahul", "Admin", 41000),
                new Emp("Seema", "HR", 42000),
                new Emp("Arjun", "IT", 38000),
                new Emp("Riya", "Finance", 45000),
                new Emp("John", "Finance", 30000),
                new Emp("Asha", "Admin", 36000)
        );
//        List<Emp> collect = employees.stream()
//                .filter(e -> e.getSalary() > 35000 && e.getSalary() < 45000)
//                .sorted(Comparator.comparing(Emp::getDepartment))
//                .collect(Collectors.toList());
//        System.out.println(collect);

        List<Emp> collect1 = employees.stream().filter(e -> e.getSalary() > 35000 && e.getSalary() < 45000)
                .sorted(Comparator.comparing(Emp::getDepartment)
                        .thenComparing(Emp::getSalary))
                .collect(Collectors.toList());
        System.out.println(collect1);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter no.test cases ");
//        int T = sc.nextInt();
//        for(int k = 1; k<=T; k++){
//            int n = sc.nextInt();
//            int [] arr = new int[n];
//            for(int i = 0; i< arr.length; i++){
//                arr[i] = sc.nextInt();
//            }
//            calculateOddEvenCoundDiff(arr);
//        }
//    }
//
//    private static void calculateOddEvenCoundDiff(int[] arr) {
//        int evenCount = 0;
//        int oddCount = 0;
//        for(int i = 0; i<arr.length; i++){
//            if(arr[i]%2 == 0){
//                evenCount++;
//            }
//            else{
//                if(arr[i]%2 != 0){
//                    oddCount++;
//                }
//            }
//        }
//        System.out.println("Diff between odd and even count is "+ Math.abs(evenCount - oddCount));
//    }

    }

}