package com.learner.lld.Quizzes_on_VarScope;

public class Quiz7 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        {
            System.out.println(x+ ", " + y);
        }
        {
            x = 15;
            System.out.println("-"+x+ ", " + y);
        }
        System.out.println("-"+x+ ", " + y);
    }
}
// Output:
// 10, 20
// -15, 20
// -15, 20
