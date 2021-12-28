package com.collectionoptions.arrays;

import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] myArray = new int[]{1,2,3,4,5};
        for(int x: myArray){
            System.out.println(x);
        }

        System.out.println();

        int[] mySecondArray = new int[4];
        mySecondArray[0] = 1;
        mySecondArray[1] = 2;
        mySecondArray[2] = 3;
        mySecondArray[3] = 4;
        for(int x: mySecondArray){
            System.out.println(x);
        }

        System.out.println(Arrays.stream(myArray).average());
    }
}
