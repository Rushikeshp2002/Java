package com.Questions;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter currency in inr = ");
        double inr = input.nextDouble();

        double USD = (inr / 76.43);
        System.out.println(USD);

    }
}
