package org.example.Group37.homework.lesson17.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 2:
        //Используя Predicate среди массива чисел вывести только те, которые являются
        //положительными.

        int[] array = {-3, 0, -1, 4, 5};

        Arrays.stream(array).filter(i -> i >= 0).forEach(System.out::println);
    }
}
