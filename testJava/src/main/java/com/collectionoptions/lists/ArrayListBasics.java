package com.collectionoptions.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBasics {
    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();
        List<Integer> newArrayList = new ArrayList<>();
        newArrayList.add(4);
        newArrayList.add(5);
        newArrayList.add(6);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        System.out.println(myArrayList);
        System.out.println(myArrayList.get(2));
        myArrayList.set(0, 0);
        myArrayList.set(1, 1);
        myArrayList.set(2, 2);
        myArrayList.set(3, 3);
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.indexOf(5));
        System.out.println(newArrayList);
        myArrayList.addAll(newArrayList);
        System.out.println(myArrayList);



    }
}
