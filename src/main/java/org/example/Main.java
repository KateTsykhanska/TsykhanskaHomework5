
package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String buildResultString(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>();

        String result = "";
        for (String str : strings) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
            if (countMap.get(str) % 2 == 0) {
                result = str;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Тестові приклади
        System.out.println(buildResultString(new String[]{"a", "b", "a"}));
        System.out.println(buildResultString(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        System.out.println(buildResultString(new String[]{"a", "", "a"}));
    }
}