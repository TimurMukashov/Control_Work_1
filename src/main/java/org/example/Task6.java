package org.example;

import java.util.HashMap;
import java.util.Map;

public class Task6 {

    public static void main(String[] args) {

        Map<String, Integer> counterNames = new HashMap<>();
        String [] employees = {
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов",
        };

        for (String employee : employees) {
            String name = employee.split(" ")[0];

            if (counterNames.containsKey(name)) {
                counterNames.put(name, counterNames.get(name) + 1);
            }
            else {
                counterNames.put(name, 1);
            }
        }

        System.out.println("Повторяющиеся имена: ");

        for (Map.Entry<String, Integer> entry : counterNames.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
