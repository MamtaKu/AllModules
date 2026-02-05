package com.learner.lld.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class DeclarationandmethodOfArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<N; i++){
            list.add(sc.nextInt());
        }
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        for(int i = 0; i<2; i++){
            list.add(sc.nextInt());
        }
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println(list);

        //remove a value at index
        list.remove(4);
        //over ride the value at index 1 with value
        list.set(2,20);
        System.out.println(list);

    }
}
