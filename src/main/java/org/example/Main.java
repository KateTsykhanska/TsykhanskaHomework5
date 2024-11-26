
package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, Integer> getLengthOfStrings(String[] strings) {
        Map<String, Integer> lengthMap = new HashMap<>();
        for (String str : strings) {
            lengthMap.put(str, str.length());
        }

        return lengthMap;
    }


    public static void main(String[] args) {
        String[] test1 = {"a", "bb", "a", "bb"};
        System.out.println(getLengthOfStrings(test1));
        String[] test2 = {"this", "and", "that", "and"};
        System.out.println(getLengthOfStrings(test2));
        String[] test3 = {"code", "code", "code", "bug"};
        System.out.println(getLengthOfStrings(test3));

    }


}

