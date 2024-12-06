
package org.example;

import java.util.Arrays;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> setA = new TreeSet<>(Arrays.asList(1, 2, 3));
        TreeSet<Integer> setB = new TreeSet<>(Arrays.asList(3, 4, 5));

        TreeSet<Integer> resultSet = new TreeSet<>();

        resultSet.addAll(setA);
        resultSet.addAll(setB);

        System.out.println("Об'єднаний TreeSet: " + resultSet);
    }
}