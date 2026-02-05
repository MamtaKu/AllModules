package com.learner.lld.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class VowelsVsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        long vowels = str.chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();

        long constants = str.length()-vowels;
        System.out.println(vowels+","+ constants);

        long vCount = IntStream.range(0, str.length()).filter(i -> str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u').count();
        long cCount = IntStream.range(0, str.length()).filter(i -> str.charAt(i) != 'a' || str.charAt(i) != 'e' || str.charAt(i) != 'i' || str.charAt(i) != 'o' || str.charAt(i) != 'u').count();

        List<Long> list = new ArrayList<>();
        list.add(vCount);
        list.add(cCount);
        System.out.println(list);


        int vowelCount = 0;
        int consonantsCount = 0;
        int [] result = new int[2];

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                vowelCount++;
            }
            else{
                consonantsCount++;
            }
        }
        result[0] = vowelCount;
        result[1] = consonantsCount;

        for(int k = 0; k<result.length; k++){
            System.out.print(result[k]+" ");
        }

    }
}
