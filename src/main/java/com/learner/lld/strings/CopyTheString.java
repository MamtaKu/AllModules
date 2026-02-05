package com.learner.lld.strings;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CopyTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String collect = IntStream.rangeClosed(0, str.length() - 2).mapToObj(i -> String.valueOf(str.charAt(i))).collect(Collectors.joining());
        System.out.println(collect);


        String copyStr = "";
        for(int i = 0; i<str.length()-1; i++){
            copyStr = copyStr+ str.charAt(i);
        }
        System.out.println(copyStr);
    }
}
