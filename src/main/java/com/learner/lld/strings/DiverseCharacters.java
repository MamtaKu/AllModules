package com.learner.lld.strings;

import java.util.Scanner;

public class DiverseCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        long alphaC = str.chars().filter(c -> c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z').count();
        long numC = str.chars().filter(c -> c >= '0' && c <= '9').count();
        String msg = (alphaC>numC) ? "Maximum occurring character type is alphabets: " + alphaC
                : (alphaC<numC) ? "Maximum occurring character type is numbers: " + numC
                : "Both types occire equally" + alphaC;
        System.out.println(msg);



        getMaxCharacterCount(str);
        int alphaBatesCount = 0;
        int numbersCount = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)>='A' && str.charAt(i)<'Z'|| str.charAt(i)>='a' && str.charAt(i)<'z'){
                alphaBatesCount++;
            }
            else if(str.charAt(i)>='0' && str.charAt(i)<'9'){
                numbersCount++;
            }
        }
        if(alphaBatesCount>numbersCount){
            System.out.println("Maximum occuring charcter type is alphabates: " + alphaBatesCount);
        }else{
            System.out.println("Maximum occuring charcter type is numbers: " + numbersCount);
        }

    }

    private static void getMaxCharacterCount(String str) {
        int alphaCount = str.replaceAll("[^A-Za-z]", "").length();
        int numberCount = str.replaceAll("[^0-9]","").length();
        if(alphaCount>numberCount){
            System.out.println("Maximum occuring charcter type is alphabates: " + alphaCount);
        }else{
            System.out.println("Maximum occuring charcter type is numbers: " + numberCount);
        }
    }


}
