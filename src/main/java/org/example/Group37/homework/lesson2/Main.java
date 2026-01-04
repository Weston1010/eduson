package org.example.Group37.homework.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Задача 1:
        Напишите программу, которая будет принимать на вход число из консоли и на выход
        будет выводить сообщение четное число или нет. Для определения четности числа
        используйте операцию получения остатка от деления (операция выглядит так: '% 2').
         */
        Scanner scan = new Scanner(System.in);
        int numScan = scan.nextInt();
        if (numScan % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }

        System.out.println((numScan % 2 == 0) ? "Четное число" : "Нечетное число");

         /* Задача 2:
        Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
        Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold»
         */

        int temp = scan.nextInt();
        if (temp > -5) {
            System.out.println("Warm");
        } else if (temp <= -5 && temp > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }

        /* Задача 3:
        Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно
         */

        for (int i = 10; i <= 20; i++) {
            System.out.println(i * i);
        }

         /*
         Задача 4:
        Необходимо, чтоб программа выводила на экран вот такую последовательность:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
         */

        int value = 7;
        while (value <= 98) {
            System.out.println(value);
            value = value + 7;
        }

        /*
        Задача *:
        Напишите программу, где пользователь вводит любое целое положительное число. А
        программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
        числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
        ввести некорректные данные.
        */

        boolean checkNum = true;
        System.out.println("Введите любое положительное число");

        while (checkNum) {
            int num = scan.nextInt();
            if (num >= 0) {
                long result = 0;
                checkNum = false;
                for (int i = 0; i <= num; i++) {
                    result = result + i;
                }
                System.out.println(result);
            } else {
                System.out.println("Пожалуйста, введите положительное число");
            }
        }

        scan.close();
    }
}