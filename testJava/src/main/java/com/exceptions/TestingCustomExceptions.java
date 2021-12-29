package com.exceptions;

public class TestingCustomExceptions {
    public static void main(String[] args) {
        try{
            throw new CustomCheckedException("My exception message goes here");
        } catch (CustomCheckedException e){
            e.printStackTrace();
        }
    }
}
