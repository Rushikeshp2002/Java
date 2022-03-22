package com.Questions;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number");
        int a = in.nextInt();
        int b = 1;
        int fact =0;
        for (int i = 1; i<=a ; i++){
            fact = a*b;
            b++;
        }
        System.out.println(fact);
    }
}
