package com.Questions;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer number");

//------here we take input from user------//

        float num1 = input.nextFloat();
//------If a number is divisible by two and its remainder is zero then it is even number---//
        if(num1%2==0){
            System.out.println("It is a even number");
        }
        else{
            System.out.println("It is a odd number");
        }

    }
}
