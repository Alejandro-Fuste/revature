package dev.lambdas;

public class LambdaPlayground {
    public static void main(String[] args) {
        MyFunctionalInterface addFive = num -> num + 5;
        System.out.println(addFive.mathematics(6));
        MyFunctionalInterface minusFive = num -> num - 5;
        System.out.println(minusFive.mathematics(6));
//        MyFunctionalInterface multipleLinesOfCode = num -> {
//            num = num + 5;
//            num = 4;
//
//        };
    }
}
