package org.example.Group37.homework.lesson20.task2;

import java.util.Arrays;

public class Main {
    //Задача 2:
    //Сортировка массива цифр в нескольких потоках различными алгоритмами:
    // сортировка вставками;
    // сортировка выбором;
    // сортировка пузырьком.
    //Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
    //результат отсортированных массивов в консоль.

    private static int[] array;

    public static void main(String[] args) {
        Thread fillArrayThread = new Thread(() -> {
            array = new int[50];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100);
            }
            System.out.println("Unsorted array values:\n" + Arrays.toString(array));
        });

        Thread insertionSortThread = new Thread(() -> {
            for (int i = 1; i < array.length; i++) {
                int current = array[i];
                int j = i;
                while (j > 0 && array[j - 1] > current) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = current;
            }
            System.out.println("\nInsertion sort array values:\n" + Arrays.toString(array));
        });

        Thread selectionSortThread = new Thread(() -> {
            for (int step = 0; step < array.length; step++) {
                int minIndex = step;
                int minValue = array[step];
                for (int i = step + 1; i < array.length; i++) {
                    if (array[i] < minValue) {
                        minValue = array[i];
                        minIndex = i;
                    }
                }
                int temp = array[step];
                array[step] = array[minIndex];
                array[minIndex] = temp;
            }
            System.out.println("\nSelection sort array values:\n" + Arrays.toString(array));
        });

        Thread bubbleSortThread = new Thread(() -> {
            boolean needIteration = true;
            while (needIteration) {
                needIteration = false;
                for (int i = 1; i < array.length; i++) {
                    if (array[i - 1] > array[i]) {
                        int temp = array[i - 1];
                        array[i - 1] = array[i];
                        array[i] = temp;
                        needIteration = true;
                    }
                }
            }
            System.out.println("\nBubble sort array values:\n" + Arrays.toString(array));
        });

        fillArrayThread.start();
        try {
            fillArrayThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        insertionSortThread.start();
        selectionSortThread.start();
        bubbleSortThread.start();
    }
}