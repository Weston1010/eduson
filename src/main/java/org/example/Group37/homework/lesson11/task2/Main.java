package org.example.Group37.homework.lesson11.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
        //значений их длины.

        Scanner scan = new Scanner(System.in);

        String[] lines = {scan.nextLine(), scan.nextLine(), scan.nextLine()};
        int n = lines.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lines[j].length() > lines[j + 1].length()) {
                    String temp = lines[j];
                    lines[j] = lines[j + 1];
                    lines[j + 1] = temp;
                }
            }
        }

        for (String line : lines)
            System.out.println(line);
    }
}
