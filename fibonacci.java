package com.rushi;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int UN = input.nextInt();
        int n = 0;
        int n1 = 0;
        int sum = 1;

        for (int i = 0 ; i<UN ; i++){

            n1 = n;
            n = n1 + sum;
            sum = n1;

        }
        System.out.println(n);
    }
}
