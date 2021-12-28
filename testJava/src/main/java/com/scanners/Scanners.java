package com.scanners;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        // to get user input from the terminal you can use the Scanner Class
        //make sure to
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please tell me your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        scanner.close();
    }
}
