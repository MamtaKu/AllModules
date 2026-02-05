package com.learner.lld.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindTheSingleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            list.add(sc.nextInt());
        }
        findSingleElement(list);
    }

    private static void findSingleElement(List<Integer> list) {
        for(int i = 0; i<list.size(); i++){
            int count = 0;
            for(int j = 0; j<list.size(); j++){
                if(list.get(i).equals(list.get(j))){
                    count++;
                }
            }
            if(count == 1) {
                System.out.println("This is the single element " + list.get(i));
            }

        }
    }
}
