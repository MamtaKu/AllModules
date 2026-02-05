package com.learner.lld.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            list.add(sc.nextInt());
        }
        System.out.println(getProductOfElements(list));
    }

    private static int getProductOfElements(List<Integer> list) {
        int product = 1;
        for(int i = 0; i<list.size(); i++){
            product = product*list.get(i);
        }
        return product;
    }
}
