package Group37.homework.lesson17.task4;

import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //Задача 4:
        //Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
        //формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        //выводить сумму, переведенную сразу в доллары.

        Scanner scan = new Scanner(System.in);
        Consumer<Double> bynToUsd = d -> System.out.println(d * 0.345340 + " USD");
        bynToUsd.accept(scan.nextDouble());
    }
}
