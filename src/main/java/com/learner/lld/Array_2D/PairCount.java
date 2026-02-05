package com.learner.lld.Array_2D;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class PairCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            list.add(sc.nextInt());
        }
        int k = sc.nextInt();
        getPairCount(list, k);
    }

    private static void getPairCount(List<Integer> list, int k) {
        int count = 0;
        for(int i = 0; i<list.size(); i++){
            for(int j = i+1; j<list.size(); j++){
                if(list.get(i)+list.get(j) == k){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
