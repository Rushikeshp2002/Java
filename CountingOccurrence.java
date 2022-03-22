package com.rushi;

import java.util.Scanner;

public class CountingOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count=0;

        while(n>0){
            int rem = n%10;  //last digit//
            if (rem == 3){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
