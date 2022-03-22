package com.rushi;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(Arms(a));
    }
    static boolean Arms(int a){
        int num = a;
        int sum = 0;
        while(a>0){
            int rem = a%10;
            a = a/10;
            int cube = rem*rem*rem;
            sum = sum + cube;

        }
        return sum == num;
    }
}
