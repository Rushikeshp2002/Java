package com.rushi;

public class IntReverse {
    public static void main(String[] args) {
        int num = 1234;
        int rem;
        int n = 0;

        while(num>0){
            rem = num%10;
            n = n*10 + rem;
            num = num/10;

        }
        System.out.println(n);
    }
}
