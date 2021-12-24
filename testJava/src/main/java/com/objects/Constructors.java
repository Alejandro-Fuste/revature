package com.objects;

public class Constructors {
//    you can declare any variables you want at the top of the class
    String constructorString; // declare but not assigned...will default to null
    int constructorInt; // declared but not assigned...will default to 0

    // if you don't declare any constructors your class will have a default called a no args constructor

    // you can make a constructor manually: this is useful if you have multiple constructors because you will lose
    // access to the default no args constructor when you make your own custom constructors
//    public Constructors(){}

    // we can create constructors that only assign values to some of the object properties
    public Constructors(String constructorString){
        // use 'this' when you are accessing an object's properties
        this.constructorString = constructorString;
    }

    public Constructors(int constructorInt){
        this.constructorInt = constructorInt;
    }

    public Constructors(String constructorString, int constructorInt){
        this.constructorString = constructorString;
        this.constructorInt = constructorInt;
    }

    // you can set default values for when an object is created
    public Constructors(){
        this.constructorString = "my new default string";
        this.constructorInt = 69;
    }

    public static void main(String[] args) {
        Constructors object1 = new Constructors();
        System.out.println(object1.constructorString);
        System.out.println(object1.constructorInt);
        System.out.println();

        Constructors object2 = new Constructors("this will be the value of our String property");
        System.out.println(object2.constructorString);
        System.out.println(object2.constructorInt);
        System.out.println();

        Constructors object3 = new Constructors(5);
        System.out.println(object3.constructorString);
        System.out.println(object3.constructorInt);
        System.out.println();

        Constructors object4 = new Constructors("Test 4 string", 6);
        System.out.println(object4.constructorString);
        System.out.println(object4.constructorInt);


    }
}
