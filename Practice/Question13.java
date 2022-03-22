package com.Questions;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two number you little shit : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 1;

        for (int i = 1; i <= b ; i++){
            sum *= a ;

        }

        System.out.println(sum);
    }
}
