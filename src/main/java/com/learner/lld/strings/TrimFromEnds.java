package com.learner.lld.strings;

import java.util.Scanner;

public class TrimFromEnds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //System.out.println(str.replaceAll("[*]", ""));

        System.out.println(str.replaceAll("^\\*+|\\*+$", ""));
        System.out.println(str.replaceAll("^[*#]+|[*#]+$", ""));
        System.out.println(str.replaceAll("^[^A-Za-z0-9]+|[^A-Za-z0-9]+$", ""));
    }
}
