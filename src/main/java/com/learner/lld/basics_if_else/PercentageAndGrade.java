package com.learner.lld.basics_if_else;

import java.util.Scanner;

public class PercentageAndGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();

        int percentage = ((A+B+C+D+E)*100)/500;
        System.out.println(percentage);

        if(percentage >= 90){
            System.out.println("Grade A");
        }
        else if(percentage >= 80 && percentage < 90){
            System.out.println("Grade B");
        }
        else if(percentage >= 70 && percentage < 80){
            System.out.println("Grade C");
        }
        else if(percentage >= 60 && percentage <70){
            System.out.println("Grade D");
        }
        else if(percentage >= 40 && percentage <60){
            System.out.println("Grade E");
        }
        else if(percentage < 40){
            System.out.println("Grade F");
        }
    }
}
