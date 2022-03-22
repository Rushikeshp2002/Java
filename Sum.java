package com.rushi;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int input1 = input.nextInt();
        int input2 = input.nextInt();
        int sum = input1+input2;
        System.out.println("Sum = "+sum);


    }
}
