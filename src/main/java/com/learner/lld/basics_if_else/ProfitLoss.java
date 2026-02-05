package com.learner.lld.basics_if_else;

import java.util.Scanner;
import java.util.function.BiFunction;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int s = sc.nextInt();

        BiFunction<Integer, Integer, Integer> amount = (a,b) -> Math.abs(a-b);
        int result = c > s ? -1 : 1;
        System.out.println(result);
        System.out.println(amount.apply(c,s));;

}
}
