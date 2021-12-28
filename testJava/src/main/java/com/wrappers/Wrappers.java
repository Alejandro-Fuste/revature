package com.wrappers;

public class Wrappers {
    public static void main(String[] args) {
        basicFunction(5);
        usingIntegerClass(5);
    }

    public static void basicFunction(int num){
        System.out.println("You entered the number " + num);
    }

    public static void usingIntegerClass(Integer num){
        System.out.println("You enter the number " + num);
    }
}
