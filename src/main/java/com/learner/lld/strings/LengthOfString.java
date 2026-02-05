package com.learner.lld.strings;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 1; k<=t; k++){
            String str = sc.next();
            getLength(str);
            getLengthUsingStream(str);
        }
    }

    private static void getLengthUsingStream(String str) {
        long count = str.chars().count();
        System.out.println(count);
    }

    private static void getLength(String str) {
        char[] charArray = str.toCharArray();
        int count = 0;
        for(int i = 0; i<charArray.length; i++){
            count++;
        }
        System.out.println(count);
    }

}
