package com.objects.abstract_inheritors;

import com.objects.AbstractClasses;

public class Baby extends AbstractClasses {
    /*
        the Override annotation tells your compiler this method is overriding another: it will throw exceptions
        if it does not actually override a method
    */

    public Baby(String abstractVariable){
        this.abstractVariable = abstractVariable;
    }

    @Override
    public void speak() {
        System.out.println("gogo gaga");
    }

    public static void main(String[] args) {
        Baby baby = new Baby("This baby object also has access to the abstractVariable");
        baby.speak();
        System.out.println();
        System.out.println(baby.abstractVariable);
        System.out.println();
        baby.printMessage();
        Baby.classMethod();
    }
}
