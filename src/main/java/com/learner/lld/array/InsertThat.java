package com.learner.lld.array;

import java.util.Scanner;

public class InsertThat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int N = sc.nextInt(); //5
        int [] arr = new int[N];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        } //1 2 3 4 5  -> 1 2 9 3 4 5  //arr.length - X
        int X = sc.nextInt(); //3
        int Y = sc.nextInt(); //9

        insertElement(arr,X,Y);// 1 2 9 3 4 5-> output
    }

    private static void insertElement(int[] arr, int X, int y) {
        int newArr[] = new int[arr.length+1];
        for(int i = 0; i<arr.length; i++) {
            if (X - 1 > i) {   // i = 0, x-i = 2, i = 1, x-i = 1
                newArr[i] = arr[i];
            } else if (X - 1 == i) {  //i = 2, x-i = 1, i = 3, x-i = 0, i = 4, x-i = -1//
                newArr[i] = y;
                newArr[i + 1] = arr[i];
            }
            else{
                newArr[i + 1] = arr[i];
            }
        }
        for(int i = 0; i<newArr.length; i++){
            System.out.print(newArr[i] +" ");
        }
    }
}
