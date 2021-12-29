package com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Please enter a whole number: ");
            int num = scanner.nextInt();
            System.out.println("Please enter another whole number: ");
            int num2 = scanner.nextInt();
            System.out.println(num/num2);
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input type! Please try again");
        } catch (ArithmeticException ae) {
            System.out.println("You can't divide by zero! Please try again");
        } catch (Exception e) {
            System.out.println("Something unexcepted happened!");
            e.printStackTrace();
        }
    }
}
