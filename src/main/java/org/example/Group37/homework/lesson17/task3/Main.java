package org.example.Group37.homework.lesson17.task3;

import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //Задача 3:
        //Используя Function реализовать лямбду, которая будет принимать в себя строку в
        //формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        //возвращать сумму, переведенную сразу в доллары.

        Scanner scan = new Scanner(System.in);
        Function<Integer, Double> parse = i -> 0.345340 * i;
        System.out.printf("%f USD", parse.apply(scan.nextInt()));
    }
}
