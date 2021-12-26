package com.objects.concrete_inheritance;

public class Parent {
    String parentString;

    public Parent(String parentString){
        this.parentString = parentString;
    }

    public void parentMethod(){
        System.out.println("This came out from the parentMethod inside the Parent class");
    }
}
