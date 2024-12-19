package org.example;

public class Calculator {

    public int add(int... elements) {
        int result = 0;
        for (int element : elements) {
            result += element;
        }
        return result;
    }

    public int subtract(int... elements) {
        int result = elements[0];
        for (int i = 1; i < elements.length; i++) {
            result -= elements[i];
        }
        return result;
    }

    public int multiply(int... elements) {
        int result = 1;
        for (int element : elements) {
            result *= element;
        }
        return result;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Ділення на нуль не дозволено!");
        }
        return (double) a / b;
    }
}
