package org.example.Group37.homework.lesson4;

public class Main {
    public static void main(String[] args) {
        //Задача 1:
        //Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
        System.out.println("Задача 1:");

        int[] numbers = {15, 34, 12, 56, 98};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        //Задача 2:
        //Найти минимальный-максимальный элементы и вывести в консоль.
        System.out.println("\n\n" + "Задача 2:");

        int[] numbers2 = {7, 17, 11, 10, 15};
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;


        for (int i = 1; i < numbers2.length; i++) {
            if (numbers2[i] < minNum) {
                minNum = numbers2[i];
            }
            if (numbers2[i] > maxNum) {
                maxNum = numbers2[i];
            }
        }

        System.out.println("Минимальный элемент: " + minNum);
        System.out.println("Максимальный элемент: " + maxNum);

        //Задача 3:
        //Найти индексы минимального и максимального элементов и вывести в консоль
        System.out.println("\n\n" + "Задача 3:");


        int[] numbers3 = {23, 11, 45, 78, 3};
        int maxNum3 = Integer.MIN_VALUE;
        int minNum3 = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < numbers3.length; i++) {
            if (numbers3[i] < minNum3) {
                minNum3 = numbers3[i];
                minIndex = i;
            }
            if (numbers3[i] > maxNum3) {
                maxNum3 = numbers3[i];
                maxIndex = i;
            }
        }
        System.out.println("\n" + "Индекс минимального числа: " + minIndex);
        System.out.println("Индекс максимального числа: " + maxIndex);


        //Задача 4:
        //Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
        //сообщение, что их нет.
        System.out.println("\n" + "Задача 4:");

        int[] numbers4 = {12, 34, 56, 1, 78, 4, 0};
        int zeroCount = 0;

        for (int i = 0; i < numbers4.length; i++) {
            if (numbers4[i] == 0) {
                zeroCount++;
            }
        }

        if (zeroCount != 0) {
            System.out.println("Кол-во нулей: " + zeroCount);
        } else {
            System.out.println("Нулей нет");
        }


        //Задача 5:
        //Пройти по массиву и поменять местами элементы первый и последний, второй и
        //предпоследний и т.д.
        System.out.println("\n" + "Задача 5:");

        int[] numbers5 = {6, 5, 4, 3, 2, 1}; // 1 2 3 4 5 6

        for (int i = 0, j = numbers5.length - 1; i < numbers5.length / 2; i++, j--) {
            int temp = numbers5[i];
            numbers5[i] = numbers5[j];
            numbers5[j] = temp;
        }

        for (int num : numbers5) {
            System.out.print(num + "  ");
        }

        //Задача 6:
        //Проверить, является ли массив возрастающей последовательностью (каждое следующее
        //число больше предыдущего).
        System.out.println("\n\n" + "Задача 6:");

        int[] numbers6 = numbers5;
        numbers6[2] = numbers6[2] + 1; // 1 2 4 4 5 6

        for (int i = 1; i < numbers6.length; i++) {
            if (numbers6[i - 1] >= numbers6[i]) {
                System.out.println("Массив не является возрастающей последовательностью");
                break;
            }
        }

        //Задача *:
        //Имеется массив из неотрицательных чисел(любой). Представьте что массив
        //представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
        //добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
        //содержит нуля в начале, кроме самого числа 0.
        //Пример:
        //Input: [1,4,0,5,6,3]
        //Output: [1,4,0,5,6,4]
        //Input: [9,9,9]
        //Output: [1,0,0,0]
        System.out.println("\n" + "Задача *:");

//                int[] array = {1, 4, 0, 5, 6, 3};
                int[] array = {9, 9, 9};
                int n = array.length;

                for (int i = n - 1; i >= 0; i--) {
                    if (array[i] < 9) {
                        array[i]++;
                        break;
                    } else {
                        array[i] = 0;
                    }
                }

                if (array[0] == 0) {
                    int[] newArray = new int[n + 1];
                    newArray[0] = 1;
                    array = newArray;
                }

                System.out.println(java.util.Arrays.toString(array));
    }
}