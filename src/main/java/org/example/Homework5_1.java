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

    public static void getGrade(int note) {
        if (note == 5) {
            System.out.println("Excellent");
        } else if (note == 1) {
            System.out.println("Bad");
        } else if (note < 0) {
            System.out.println("Wrong score");
        }
    }


}
