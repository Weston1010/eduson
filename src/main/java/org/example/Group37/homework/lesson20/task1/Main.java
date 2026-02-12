package org.example.Group37.homework.lesson20.task1;

import java.util.Scanner;

public class Main {
    //Задача 1:
    //Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
    //потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
    //вычислений возвращаются в метод main()

    private static int[] array;
    private static int max;
    private static int min;

    public static void main(String[] args) {
        array = fillArray();

        Thread thread1 = new Thread(() -> {
            max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("max: %d, min: %d", max, min);
    }

    private static int[] fillArray() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Specify the size of the array:");
        int sizeArray = scan.nextInt();
        int[] array = new int[sizeArray];

        System.out.println("Specify the elements of the array:");
        for (int i = 0; i < sizeArray; i++) {
            array[i] = scan.nextInt();
        }

        scan.close();
        return array;
    }
}