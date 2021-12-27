package com.interfaces;

// to create an interface you use the "interface" keyword of the class keyword
public interface BasicInterface {
    /* advantage of interface over abstract...a class can implement multiple interfaces...a class can only implement
       one abstract class
     */
    // all interfaces variables are public static final variables...the final means the variable is a constant
    public static final String interfaceString = "This is my interface string";

    // interface methods are by default public abstract, so neither keyword is needed
    void myAbstractMethod();

    // default interface methods have a default implementation that can be overridden by any implementing classes
    default void myDefaultMethod(){
         System.out.println("This is the default implementation...it can be changed by any class that inherits it");
    }

    // static methods can only be called by referencing the interface itself
    static void myStaticMethod(){
         System.out.println("I can call this method via the interface: it can not be overridden");
    }
}
