package com.learner.lld.Quizzes_on_VarScope;

public class Quiz4 {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int x = 100, y = 200;
        System.out.println(sum(x, y));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
// Output: 300
