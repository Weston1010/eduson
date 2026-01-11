package org.example.Group37.homework.lesson15.task1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Задача 1:
        //Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
        //4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
        //При решении использовать коллекции

        try (Scanner scan = new Scanner(System.in)) {
            String input = scan.nextLine();
            String[] splitLine = input.split("\\D+");
            Set<Integer> set = new HashSet<>();
            for (String stringNumber : splitLine) {
                set.add(Integer.valueOf(stringNumber));
            }
            for (Integer num : set) {
                System.out.print(num + " ");
            }
        }
    }
}