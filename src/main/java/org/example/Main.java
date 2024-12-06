
    package org.example;

    import java.util.Arrays;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public class Main {
        public static int findMostFrequentElement(List<Integer> numbers) {
            Map<Integer, Integer> frequencyMap = new HashMap<>();

            for (int number : numbers) {
                frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
            }

            int maxFrequency = 0;
            int mostFrequent = -1;
            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                if (entry.getValue() > maxFrequency) {
                    maxFrequency = entry.getValue();
                    mostFrequent = entry.getKey();
                }
            }

            return mostFrequent;
        }

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 1, 2, 3, 3, 3);
            System.out.println("The most frequent element is: " + findMostFrequentElement(numbers));
        }
    }