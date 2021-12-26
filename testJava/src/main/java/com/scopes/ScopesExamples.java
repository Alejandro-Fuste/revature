package com.scopes;

public class ScopesExamples {
    /* I Catch Many Bitches
        I => Instance/Object
        C => Class/Static
        M => Method
        B => Block
    */


    String myInstanceScopeString; // this is part of the instance/object scope (accessed via the "this" keyword)
    static String myStaticString; // this is part of the static/class scope

    public static void myStaticMethod(){
        String phrase = "This is only available within this method";
        for(int x = 0; x < 1; x++){
            System.out.println("The x variable I created for this loop is part of the block scope");
        }
    }
}
