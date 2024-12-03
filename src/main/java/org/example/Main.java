
package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, String> mergeStringsByFirstChar(String[] strings) {
        Map<String, String> result = new HashMap<>();
        for (String str : strings) {
            String key = str.substring(0, 1);
            result.put(key, result.getOrDefault(key, "") + str);
        }
        return result;
    }


    public static void main(String[] args) {

        System.out.println(mergeStringsByFirstChar(new String[]{"salt", "tea", "soda", "toast"}));
        System.out.println(mergeStringsByFirstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}));
        System.out.println(mergeStringsByFirstChar(new String[]{}));
    }
}
