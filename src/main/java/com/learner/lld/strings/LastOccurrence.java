package com.learner.lld.strings;

import java.util.Scanner;
import java.util.stream.IntStream;

public class LastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();

        int i2 = IntStream.iterate(str.length() - 1, i -> i >= 0, i -> i - 1)
                .filter(i -> str.charAt(i) == k)
                .findFirst()
                .orElse(-1);
        System.out.println(i2);

        int i1 = IntStream.rangeClosed(0, str.length()-1)
                .map(i -> str.length() -1 -i)
                .filter(i -> str.charAt(i) == k)
                .findFirst()
                .orElse(-1);
        System.out.println(i1);

        System.out.println(getLastOccurence(str, k));
    }

    private static int getLastOccurence(String str, int k) {
        for(int i = str.length()-1; i>=0; i++){
            if(str.charAt(i) == k){
                return i;
            }
        }
       return -1;
    }
}
