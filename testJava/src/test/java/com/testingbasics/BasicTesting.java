package com.testingbasics;

//import org.testng.Assert;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

public class BasicTesting {

    @BeforeClass
    void setup(){
        System.out.println("Anything in a BeforeClass will run before any tests are run");
    }

    @BeforeMethod
    void beforeEachTest(){
        System.out.println("runs before each test");
    }

    @Test(priority = 1)
    void testName(){
        System.out.println("Actual test");
        // test code goes here
        int x = 5 + 5;

        // use Assert class to check your results
        Assert.assertEquals(x, 10);
    }

    @Test(priority = 2)
    void showingOffOtherAnnotations(){
        System.out.println("another test");
    }
}
