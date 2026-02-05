package com.learner.lld.strings;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String rev = "";

        for(int i = str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("palindrome string");
        }
        else{
            System.out.println("not palindrome");
        }

        System.out.println(checkPalindrome(str));

        boolean b = IntStream.range(0, str.length() / 2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - 1 - i));
        System.out.println(b ? "Palindrome string" : "Not palindrome");

        StringBuilder sb = new StringBuilder();
       for(int i = str.length()-1;  i >=0; i--){
           sb.append(str.charAt(i));
       }
        System.out.println(sb);
       if(str.equals(sb.toString())){
           System.out.println("palindrome string");
       }
       else{
           System.out.println("not palindrome");
       }
    }

    private static boolean checkPalindrome(String str) {
        int k = 0;
        int m = str.length() - 1;

        while (k < m) {
            if (str.charAt(k) != str.charAt(m)) {
                return false;
            }
            k++;
            m--;
        }
        return true;
    }
}
