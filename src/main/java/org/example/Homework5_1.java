package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Homework5_1 {
    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println("You are not adult");
        } else {
            System.out.println("You are adult");
        }
    }

    public boolean isPerfectSquare(int number) {
        if (number < 0) {
            return false;
        }
        return (int) Math.sqrt(number) * Math.sqrt(number) == number;
    }


    public static boolean simpleNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}