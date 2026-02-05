package com.learner.lld.strings;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] strArray = {"batch", "balloon", "bag"};

        String result = "";
        for(int i = 0; i<strArray[0].length();  i++) {
            char c = strArray[0].charAt(i);
            for (int j = 1; j < strArray.length; j++) {
                if (i >= strArray[j].length() || strArray[j].charAt(i) != c) {
                    System.out.println("Max prefix is: " + result);
                    return;
                }
            }
            result = result + c;
        }
        System.out.println(result);

    }
}
