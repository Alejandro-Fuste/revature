package com.objects;

// to make a class abstract add the non access modiifer keyword "abstract" to the class definition
public abstract class AbstractClasses {
    /* in Java you can have abstract classes: these are classes that cannot in themselves be instantiated...can't use
    new keyword with them. They are useful when you need to reuse code in multiple locations and when you need to have
    similar methods with different implementations in different classes. This is part of polymorphism.
     */

    public String abstractVariable;
    public static int abstractNumber = 6;

    // to make a method abstract you add the non access modifier keyword "abstract" to it
    public abstract void speak();

    // "concrete" method
    public void printMessage(){
        System.out.println("This is available to all classes that inherit from this abstract class");
    }

    // static (or class) method
    public static void classMethod(){
        System.out.println("I can print this message only by utilizing the class and not the object");
    }

    public static void seeAbstractNumber(){
        System.out.println("The static property called abstractNumber has value: " + abstractNumber);
    }
}
