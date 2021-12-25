package com.objects.abstract_inheritors;


import com.objects.AbstractClasses;

public class Adult extends AbstractClasses {

    public Adult(String abstractVariable){
        this.abstractVariable = abstractVariable;
    }

    @Override
    public void speak() {
        System.out.println("I can speak in full sentences");

    }

    public static void main(String[] args) {
        Adult adult = new Adult("This was provided by the abstract class");
        System.out.println(adult.abstractVariable);
        System.out.println();
        adult.printMessage();
        Adult.classMethod();
        Adult.seeAbstractNumber();
        System.out.println(Adult.abstractNumber);
    }
}
