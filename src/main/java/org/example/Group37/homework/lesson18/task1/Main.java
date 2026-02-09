package org.example.Group37.homework.lesson18.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Задача 1:
        //Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
        //Stream'ов:
        //- Удалить дубликаты
        //- Оставить только четные элементы
        //- Вывести сумму оставшихся элементов в стриме

        ArrayList<Integer> list = new ArrayList<>();
        fillList(list);
        editList(list);
    }

    private static void fillList(ArrayList<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);
            list.add((int) (Math.random() * (21)) + 1);
        }
        printList(list);
    }

    private static void editList(ArrayList<Integer> list) {
        list.stream()
                .distinct()
                .filter(x -> x % 2 == 0)
                .forEach(x -> System.out.print(x + "  "));
        System.out.println();
        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }

    private static void printList(ArrayList<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }
}