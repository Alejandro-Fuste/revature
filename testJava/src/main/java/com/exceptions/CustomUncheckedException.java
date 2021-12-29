package com.exceptions;

public class CustomUncheckedException extends RuntimeException{
    public CustomUncheckedException(String message){
        super(message);
    }
}
