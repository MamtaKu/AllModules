package com.learner.lld.strings;

public class AccessStringChars {
    public static void main(String[] args) {
        String str = "Hello World";
        long count = str.chars().mapToObj(c -> (char) c).count();
        System.out.println(count);

        System.out.println(str.length());

        str.chars().mapToObj(c -> (char)c).forEach(c -> System.out.print(c+","));

        System.out.println();

        char ch = str.charAt(2);
        System.out.println(ch);

        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();

        String substring = str.substring(1,4);
        System.out.println(substring);

        String string = str.chars().mapToObj(c -> (char) c)
                .skip(3)
                .limit(2)
                .collect(StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append)
                .toString();
        System.out.println("-----------");
        System.out.println(string);


        String temp = "Mamta";
        temp = temp +'K';
        System.out.println(temp);

        temp = temp + 10;
        System.out.println(temp);
    }
}
