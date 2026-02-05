package com.learner.lld.dataTypes;

public class Quiz4 {
    public static void main(String[] args) {
        long a = 1000;
        //int b = a; ---//error, we can not keep long type variable into int type variable
        int b = (int)a;
        System.out.println(b);
    }
}
