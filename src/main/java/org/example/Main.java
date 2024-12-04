
    package org.example;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.LinkedHashSet;
    import java.util.Map;

    public class Main {
            public static boolean haveCommonElements(LinkedHashSet<Integer> setA, LinkedHashSet<Integer> setB) {
                LinkedHashSet<Integer> copyA = new LinkedHashSet<>(setA);
                copyA.retainAll(setB);
                return !copyA.isEmpty();
            }

            public static void main(String[] args) {
                LinkedHashSet<Integer> setA = new LinkedHashSet<>();
                setA.add(1);
                setA.add(2);
                setA.add(3);
                setA.add(4);

                LinkedHashSet<Integer> setB = new LinkedHashSet<>();
                setB.add(3);
                setB.add(5);
                setB.add(6);

                System.out.println(haveCommonElements(setA, setB));
            }
        }
