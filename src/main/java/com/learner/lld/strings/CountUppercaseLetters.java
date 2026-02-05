package com.learner.lld.strings;

import java.util.Scanner;

public class CountUppercaseLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str.chars().mapToObj(c -> (char)c).filter(c -> c.charValue()>='A' && c.charValue()<='Z').forEach(System.out::println);
        char ch = 'a';
        System.out.println((int)ch);

        char c = '%';
        System.out.println((int)c);

        getTheUppercaseCount(str);
    }

    private static void getTheUppercaseCount(String str) {
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                System.out.print(str.charAt(i)+" ");
                count++;
            }
        }
        System.out.println(count);
    }
}
