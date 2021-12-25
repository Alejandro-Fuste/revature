package com.methods;

public class MethodBasics {
    // to make an object do something you need to create methods

    /*
     anatomy of a method
     1. access modifier keyword (if any)
     2. non-access modifier key (if any)
     3. return type (void if nothing is returned)
     4. method name (use camelCase)
     5. parameters inside parentheses ()
     6. code inside {}
    */

    // this method has an access modifier and return type
    public void printToConsole(){
        System.out.println("This is a simple method that prints a message to the console");
    }

    // you can add parameters to your methods
    public void printUniqueMethodToConsole(String phrase){
        System.out.println(phrase);
    }

    // it does not have to be just one parameter
    public void doAddition(int num1, int num2){
        System.out.println(num1 + num2);
    }

    // you use the "return" keyword to indicate what you are getting back from the method
    public String returnPhrase(String phrase){
        return "your phrase is: " + phrase;
    }

    public String returnAdditionAsString(String phrase, int num1, int num2){
        return phrase + (num1 + num2);
    }

    public boolean isThisTrue(int num) {
        if (num == 5) {
            return true;
        } else {
            return false;
        }
    }
        // java supports varargs (variable arguments) which are useful when you can't be sure how many
        // inputs your method is going to receive

        public void varArgs(int... args){
            for (int x = 0; x < args.length; x++){
                System.out.println(args[x]);
            }
        }


    public static void main(String[] args) {
        MethodBasics object1 = new MethodBasics();
        object1.printToConsole();
        object1.printUniqueMethodToConsole("I am your father!");
        object1.doAddition(6, 9);
        System.out.println(object1.returnPhrase("This is my new phrase"));
        System.out.println(object1.returnAdditionAsString("The new phrase: ", 6, 9));
        System.out.println(object1.isThisTrue(4));
        System.out.println();
        object1.varArgs(1,2,3,4,5);

    }
}
