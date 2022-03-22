package com.Questions;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a name = ");

//-------Basic user input-------//
        String name = input.nextLine();
        System.out.println("Happy birthday "+name);
    }
}
