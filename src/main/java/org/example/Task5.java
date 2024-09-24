package org.example;

import java.util.HashMap;
import java.util.Map;

public class Task5 {

    public static void main(String[] args) {

        Map<String, String[]> map = new HashMap<>();

        map.put("Тимур", new String[] {"89228391032", "89228391035"});
        map.put("Иван", new String[] {"89228371032"});
        map.put("Артем", new String[] {"89227377032"});
        map.put("Данат", new String[] {"89227470327"});

        for (String name : map.keySet()) {
            System.out.print(name + " : ");

            for (String number : map.get(name)) {
                System.out.print(number + " ");
            }

            System.out.println();
        }
    }
}
