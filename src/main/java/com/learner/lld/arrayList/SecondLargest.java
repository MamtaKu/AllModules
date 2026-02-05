package com.learner.lld.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            list.add(sc.nextInt());
        }
        System.out.println(secondLargest(list));
    }

    private static int secondLargest(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        if(list.size()<2){
            return -1;
        }
        for(int i = 0; i<list.size(); i++){
            if(list.get(i)>max){
                secondMax = max;
                max = list.get(i);

            }
            else if(list.get(i)<max && list.get(i)>secondMax){
                secondMax = list.get(i);
            }
        }
        return secondMax;
    }
}
