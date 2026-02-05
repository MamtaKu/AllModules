package com.learner.lld.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsecutiveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            list.add(sc.nextInt());
        }
        System.out.println(checkConsecutiveDuplicates(list));
    }

    private static boolean checkConsecutiveDuplicates(List<Integer> list) {
        for(int i = 1; i<list.size(); i++){
            if(list.get(i-1) == list.get(i)){
                return true;
            }
        }
        return false;
    }
}
