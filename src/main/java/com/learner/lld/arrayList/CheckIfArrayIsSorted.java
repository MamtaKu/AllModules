package com.learner.lld.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            list.add(sc.nextInt());
        }
        System.out.println(checkIfArraySorted(list));
    }

    private static int checkIfArraySorted(List<Integer> list) {
        for(int i = 0; i<list.size(); i++){
            for(int j = i+1; j<list.size(); j++){
                if(list.get(i)>list.get(j)){
                    return 0;
                }
            }
        }
        return 1;
    }
}
