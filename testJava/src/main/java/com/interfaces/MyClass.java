package com.interfaces;

public class MyClass implements BasicInterface{
    public static void main(String[] args) {
        System.out.println(MyClass.interfaceString);
        MyClass object = new MyClass();
        object.myAbstractMethod();
        object.myDefaultMethod();
        BasicInterface.myStaticMethod();
    }

    @Override
    public void myAbstractMethod() {
        System.out.println("I got this method from the interface I implement");
    }

    @Override
    public void myDefaultMethod(){
        System.out.println("This is my newly implemented default method");
    }

}
