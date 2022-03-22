package com.rushi;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers :");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max=0;



//----------Method no 1-------------//

//        int max = a;
//
//        if(b>max){
//            max = b;
//        }
//
//        if(c>max){
//            max = c;
//        }

//-------------------------------//////





//---------Method no 2----------///

//        int max = Math.max(c,Math.max(a,b));

///---------------------------////////





//---------Method no 3--------///


//        if(a>b){
//            max = a;
//        }
//        else{
//            max = b;
//        }
//
//        if(b>c){
//            max = b;
//
//        }
//        else{
//            max = c;
//        }

//------------------------------///




        System.out.println(max);
    }
}
