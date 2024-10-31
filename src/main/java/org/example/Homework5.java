package org.example;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Homework5 {
    public static void checkAge (int age) {
        if (age < 18) {
            System.out.println("You are not adult");
        }
        else {
            System.out.println("You are adult");
        }
    }
    public  boolean isPerfectSquare (int number) {
        if (number < 0){return false;
        }
        return (int)Math.sqrt(number)*Math.sqrt(number) == number;

    }

    public void sumUpToN (int n) {
        int result = 0;
        for(int i = 1; i<=n; i++) {
            result += i;
        }
        System.out.println("Sum = " + result);

    }
}