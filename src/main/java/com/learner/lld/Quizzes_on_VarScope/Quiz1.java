package com.learner.lld.Quizzes_on_VarScope;

public class Quiz1 {
    //Quize1
    public static void main(String[] args) {
        int a = 10, b = 5;
        int x = 100, y = 200;
        System.out.println(sum(x,y));
    }
    public static int sum(int a, int b){
        //int a = 20, b = 30;   compile time error: variable a is already defined in method sum(int, int)
        return a+b;
    }

}
