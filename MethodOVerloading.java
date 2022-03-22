package com.rushi;

import java.util.Arrays;
import java.util.Scanner;

public class MethodOVerloading {
    public static void main(String[] args) {

//        demo(1,2,3,4,5,5);
        demo("Rushikesh","Tanmay");
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static  void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
