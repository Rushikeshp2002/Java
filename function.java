package com.rushi;

import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        sum();
    }
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a+b;
        System.out.println(c);
        return c;

    }
}
