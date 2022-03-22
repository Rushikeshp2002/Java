package com.Questions;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers = ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        if(num1>num2){
            System.out.println("The largest number is "+ num1);
        }

        else{
            System.out.println("The largest number is "+ num2);
        }
    }
}
