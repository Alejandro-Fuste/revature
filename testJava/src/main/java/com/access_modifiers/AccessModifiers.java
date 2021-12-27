package com.access_modifiers;

// this class is public: it can be accessed anywhere in our code
public class AccessModifiers {
    /*
    There are 4 access modifiers in Java:

    public
    protected
    default
    private

     */

    protected String myProtectedString = "This string is available for use within the same package " +
            "and in any classes that inherit this one";

    String myDefaultString = "This string is only available within this package. Any classes that inherit from this" +
            "class will not be able to access this string unless they are also located in this package";

    private String myPrivateString = "This string is only available within this class: it can not be access directly" +
            "in any other place";
}
