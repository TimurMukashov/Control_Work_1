package org.example;

import java.util.regex.Pattern;

public class Task4 {

    public static void main(String[] args) {

        String color = "#FF0000";
        Pattern pattern = Pattern.compile("^#[0-9A-Fa-f]{6}$");
        boolean isValidation = pattern.matcher(color).matches();

        if (isValidation) {
            System.out.println("Строка является шестнадцатиричным идентификатором цвета в HTML.");
        }
        else {
            System.out.println("Строка не является шестнадцатиричным идентификатором цвета в HTML.");
        }
    }
}
