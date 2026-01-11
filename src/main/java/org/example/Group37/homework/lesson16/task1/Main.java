package org.example.Group37.homework.lesson16.task1;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //Задача 1:
        //На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
        //строка является ключом, и ее значение равно true, если эта строка встречается в массиве
        //2 или более раз. Пример:
        //wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
        //wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
        //wordMultiple(["c", "c", "c", "c"]) → {"c": true}

        String[] array1 = {"a", "b", "a", "c", "b" };
        String[] array2 = {"c", "b", "a" };
        String[] array3 = {"c", "c", "c", "c" };

        printMap(checkRepeat(array1));
        printMap(checkRepeat(array2));
        printMap(checkRepeat(array3));
    }

    private static Map<String, Boolean> checkRepeat(String[] array) {
        Map<String, Boolean> threeMap = new TreeMap<>();
        for (String str : array) {
            Boolean isFound = threeMap.put(str, false);
            if (isFound != null) {
                threeMap.put(str, true);
            }
        }
        return threeMap;
    }

    private static void printMap(Map<String, Boolean> map) {
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            System.out.print("[" + entry.getKey() + " : " + entry.getValue() + "] ");
        }
        System.out.println();
    }
}
