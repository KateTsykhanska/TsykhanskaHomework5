
package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(3, 14, 15, 92, 6);
        System.out.println(myList);


        List<String> myList1 = new ArrayList<String>() {
            {
                add("Kateryna");
                add("Oleksandrivna");
                add("Tsykhanska");
            }
        };
        System.out.println(myList1);

        Set<Integer> noDuplicates = new HashSet<>();
        noDuplicates.add(1);
        noDuplicates.add(2);
        noDuplicates.add(3);
        noDuplicates.add(1);
        noDuplicates.add(2);
        System.out.println(noDuplicates);

        Map<String, String> cityPhoneCodes = new HashMap<>();
        System.out.println("Міста України та їх телефонний код:");
        cityPhoneCodes.put("Одеса", "048");
        cityPhoneCodes.put("Харкiв", "057");
        cityPhoneCodes.put("Днiпро", "056");
        for (Map.Entry<String, String> entry : cityPhoneCodes.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());

        }
    }
}
