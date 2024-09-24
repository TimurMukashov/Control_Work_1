package org.example;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        String[] words = text.split(" ");
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith("а")) {
                count++;
            }

            if (words[i].startsWith("А")) {
                words[i] = words[i].replaceFirst("А", "а");
                count++;
            }
        }

        String newText = String.join(" ", words);
        System.out.println("Новый текст: " + newText);
        System.out.println("Количество слов, начинающихся на 'а': " + count);
    }
}
