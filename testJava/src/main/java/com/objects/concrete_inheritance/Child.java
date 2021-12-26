package com.objects.concrete_inheritance;

public class Child extends Parent{
    String childString;

    public Child(String parentString, String childString){
        super(parentString);
        this.childString = childString;
    }

    public static void main(String[] args) {
        Child child = new Child("This is the parent String", "This is the child string");
        System.out.println(child.parentString);
        System.out.println(child.childString);
        child.parentMethod();
    }
}
