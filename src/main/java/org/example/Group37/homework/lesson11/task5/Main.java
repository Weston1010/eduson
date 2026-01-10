package org.example.Group37.homework.lesson11.task5;

public class Main {
    public static void main(String[] args) {
        //5. Вывести на консоль новую строку, которой задублирована каждая буква из
        //начальной строки. Например, "Hello" -> "HHeelllloo"

        String original = "Hello";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);
            result.append(c).append(c);
        }
        System.out.println(result.toString());
    }
}
