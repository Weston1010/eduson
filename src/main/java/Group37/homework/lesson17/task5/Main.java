package Group37.homework.lesson17.task5;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //Задача 5:
        //Используя Supplier написать метод, который будет возвращать введенную с консоли
        //строку задом наперед.

        Supplier flipLine = () -> {
            try (Scanner scan = new Scanner(System.in)) {
                StringBuilder sb = new StringBuilder(scan.nextLine());
                return sb.reverse();
            }
        };
        System.out.println(flipLine.get());
    }
}
