package com.Questions;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press X or x
        int ans = 0;
        int flag = 0;
        while (flag == 0) {
            // take operator as input
            System.out.print("Enter the Operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two numbers
                System.out.println("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                    if (op == '%') {
                        ans = num1 % num2;
                    }
                }

                System.out.println(ans);
            }
            else if (op == 'x' || op == 'X') {
                System.out.println("Exit Successfully");
                flag = 1;
            }
            else {
                System.out.println("Invalid Operation!!");
            }


        }
    }
}
