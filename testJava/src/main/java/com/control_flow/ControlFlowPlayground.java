package com.control_flow;

public class ControlFlowPlayground {
    public static void main(String[] args) {
        int x = 4;

//        if (x == 5){
//            System.out.println("x does equal 5");
//        }

//        if (x == 5){
//            System.out.println("x does equal 5");
//        } else {
//            System.out.println("x does not equal five");
//        }

//        if (x == 5){
//            System.out.println("x does equal 5");
//        } else if (x == 4) {
//            System.out.println("x equals 4");
//        } else {
//            System.out.println("x does not equal 4 or 5");
//        }
        int[] nums = {1,2,3,4,5};

//        for (int y = 0; y < nums.length; y++){
//            System.out.println(nums[y]);
//        }

        for(int y: nums){
            System.out.println(y);
        }

//        String myString = "a";
//
//        for (int z = 0; myString.length() < 10; myString = myString + myString){
//            System.out.println(myString);
//        }
        int z = 0;

        while (z < 10) {
            System.out.println(z);
            z++;
        }

        do {
            System.out.println(z);
        } while (z < 10);

        int a = 3;

        switch (a) {
            case 1 -> {
                System.out.println("variable a = 1");
            }
            case 2 -> {
                System.out.println("variable a = 2");
            }
            case 3 -> {
                System.out.println("variable a = 3");
            }
            case 4 -> {
                System.out.println("variable a = 4");
            }
            case 5 -> {
                System.out.println("variable a = 5");
            }
        }

    }
}
