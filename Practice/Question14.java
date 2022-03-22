package com.Questions;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = in.nextInt();
        int rem = 1;
        int n =0;
        while(a>=1){
             rem = a % 10;
             n = n*10+ rem;
            a = a/10;
        }
        System.out.println(n);
    }
}
