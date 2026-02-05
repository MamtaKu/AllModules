package com.learner.lld.strings;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();

        int idx = IntStream.range(0, str.length()).filter(i -> str.charAt(i) == k).findFirst().orElse(-1);
        System.out.println(idx);

        System.out.println(getFirstOccurrence(str, k));

    }


    private static int getFirstOccurrence(String str, int k) {
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == k){
                return i;
            }
        }
        return -1;
    }
}
