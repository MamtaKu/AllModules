package com.learner.lld.dataTypes;

public class Quiz3 {
    public static void main(String[] args) {
        //float a = 5.2;  ----//By default Java treats decimal number as double and double size is 8 bytes
        // and we are keeping decimal number in float variable which is size of 4 bytes. That is not
        // possible ,so it will give complie time error as possible lossy conversion error. so fix this issue we
        // can use 'f' after decimal number so now we consider vale as flaot , not decimal
        float a = 5.2f;
        System.out.println(a);
    }
}
