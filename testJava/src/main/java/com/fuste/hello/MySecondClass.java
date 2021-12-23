// The location of the package...how Java knows where to the class information
// Always leave package declaration at the top of class file
package com.fuste.hello;

// public is the access modifier, which tells your code where the class can and can't be accessed
public class MySecondClass {
//    all functions are tied to classes or interfaces
//    anatomy:
//        public: who can access
//        static: can use method without creating new instance first
//        void: return type of the method. Can be int, string, etc. Need this
//        main: this is the name of the method...this the entry point...every class need a main method
//        (String[] args): the parameters of the method go inside the (). Need String[] args for main
    public static void main(String[] args) {System.out.println("Hello World 2!");}}
