
    package org.example;

    import java.util.HashMap;
    import java.util.Map;

    public class Main {
            public static Map<String, Integer> countWords(String[] words) {
                Map<String, Integer> wordMap = new HashMap<>();
                for (String word : words) {
                    wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
                }
                return wordMap;
            }

        public static void main(String[] args) {

            System.out.println(countWords(new String[] {"a", "b", "a", "c", "b"}));
            System.out.println(countWords(new String[] {"c", "b", "a"}));
            System.out.println(countWords(new String[] {"c", "c", "c", "c"}));
        }
    }
