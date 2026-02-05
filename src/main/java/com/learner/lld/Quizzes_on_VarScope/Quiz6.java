package com.learner.lld.Quizzes_on_VarScope;

public class Quiz6 {
    public static void main(String[] args) {
        int a = 0;
        {
            int b = 0;
            System.out.println("b = " + b);
            int c = b+a;
            System.out.println("c = " + c);
        }
        //a = b+c;  // Error: cannot find symbol
        System.out.println("a = " + a);
    }
}
