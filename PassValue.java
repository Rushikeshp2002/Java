package com.rushi;

public class PassValue {
    public static void main(String[] args) {
        String message = mygreet("Rushikesh patil");
        System.out.println(message);
    }

     static String mygreet(String name) {
        String greet = "hello "+name;
        return  greet;
    }

}
