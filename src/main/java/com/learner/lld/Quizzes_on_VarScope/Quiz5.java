package com.learner.lld.Quizzes_on_VarScope;

public class Quiz5 {
    public static void main(String[] args) {
        if(true){
            int x = 10;
            System.out.println("Value of x = " +x);
            x++;
        }
        //System.out.println("Value of x = " + x);  // Compilation Error: x cannot be resolved to a variable
    }
}
