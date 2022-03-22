package com.Questions;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//------Taking input from user ---------------------------------///
        System.out.print("Enter the value of principal = ");
        double principle = input.nextDouble();

        System.out.print("Enter the value of time = ");
        double time = input.nextDouble();

        System.out.print("Enter the value of rate = ");
        double rate = input.nextDouble();

//------Applying the formula and getting the output-------/////
        double Simple_Interest = principle*(1+(rate*time));
        System.out.println(Simple_Interest);
    }
}
