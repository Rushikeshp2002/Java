package com.Questions;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  a number :");

//------Taking input from user----------------/////
        int num1 = input.nextInt();
        int num2 = input.nextInt();

//------Providing menu------------------------//
        System.out.println("Menu");
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Substraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter any integer for Modulo");


       while(true) {
//---------Taking operation input according to menu-------//
           System.out.print("Enter operation = ");
           int num = input.nextInt();
           if (num == 1) {
               System.out.println("Addition of two numbers is");
               System.out.println(num1 + num2);
           } else if (num == 2) {
               System.out.println("Subtraction of two numbers is");
               System.out.println(num1 - num2);
           } else if (num == 3) {
               System.out.println("Multiplication of two numbers is");
               System.out.println(num1 * num2);
           } else if (num == 4) {
               System.out.println("Division of two numbers is");
               System.out.println(num1 / num2);
           } else {
               System.out.println("Modulo of two numbers is");
               System.out.println(num1 % num2);
           }

       }
    }

}
