package com.Questions;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int num = in.nextInt();
        for(int i = 1; i<=10 ; i++){
            System.out.println(num * i);

        }
    }
}
