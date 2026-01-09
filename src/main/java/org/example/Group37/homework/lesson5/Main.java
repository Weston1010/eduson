package org.example.Group37.homework.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задача 1:
        //1.1 Создать двумерный массив, заполнить его случайными числами.
        //1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
        //1.3 Найти сумму всех получившихся элементов и вывести в консоль.

        Scanner console = new Scanner(System.in);
        int[][] array = new int[5][4];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100) + console.nextInt();
                sum = sum + array[i][j];
            }
        }

        System.out.println("Задача 1:");
        System.out.println(sum);

        //Задача 2:
        //Создать программу для раскраски шахматной доски с помощью цикла. Создать
        //двумерный массив String 8х8. С помощью циклов задать элементам массива значения
        //B(Black) или W(White). При выводе результат работы программы должен быть
        //следующим:
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        System.out.println("\n" + "Задача 2:");

        String[][] array2 = new String[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    array2[i][j] = "W";
                } else {
                    array2[i][j] = "B";
                }
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        //Задача *:
        //Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
        //Формат входных данных:
        //Программа получает на вход два числа n и m.
        //Формат выходных данных:
        //Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
        //символа.
        System.out.println("\n" + "Задача *:");

        int n = console.nextInt();
        int m = console.nextInt();
        int[][] array3 = new int[n][m];
        int counter = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    array3[i][j] = counter++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    array3[i][j] = counter++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d", array3[i][j]);
            }
            System.out.println();
        }
    }
}