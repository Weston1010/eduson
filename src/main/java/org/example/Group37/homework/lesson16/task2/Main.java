package org.example.Group37.homework.lesson16.task2;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //Задача 2:
        //На вход поступает массив непустых строк, создайте и верните Map<String,
        //String> следующим образом: для каждой строки добавьте ее первый символ в
        //качестве ключа с последним символом в качестве значения. Пример:
        //pairs(["code", "bug"]) → {"b": "g", "c": "e"}
        //pairs(["man", "moon", "main"]) → {"m": "n"}
        //pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

        String[] array1 = {"code", "bug"};
        String[] array2 = {"man", "moon", "main"};
        String[] array3 = {"man", "moon", "good", "night"};

        printMap(stringProcessing(array1));
        printMap(stringProcessing(array2));
        printMap(stringProcessing(array3));
    }

    private static Map<String, String> stringProcessing(String[] array) {
        Map<String, String> map = new TreeMap<>();
        for (String s : array) {
            map.put(String.valueOf(s.charAt(0)),
                    String.valueOf(s.charAt(s.length() - 1)));
        }
        return map;
    }

    private static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.printf("[%s : %s] ", entry.getKey(), entry.getValue());
        }
        System.out.println();
    }
}
