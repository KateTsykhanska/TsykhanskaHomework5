package org.example;

import java.util.*;

public class Main {

    public static Map<String, String> createMap(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            map.put(s.substring(0, 1), s.substring(s.length() - 1));
        }
        return map;
    }

    public static void main(String[] args) {
        String[] input = {"code", "bug"};
        Map<String, String> result = createMap(input);
        System.out.println(result);

        String[] input1 = {"man", "moon", "main"};
        Map<String, String> result1 = createMap(input1);
        System.out.println(result1);

        String[] input2 = {"man", "moon", "good", "night"};
        Map<String, String> result2 = createMap(input2);
        System.out.println(result2);

    }
}
