package org.example.Group37.homework.lesson11.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
        //Если таких слов несколько, найти первое из них.

        Scanner scan = new Scanner(System.in);

        String[] lines = {scan.nextLine(), scan.nextLine(), scan.nextLine()};
        for (String line : lines) {
            boolean isMatch = false; //есть ли в слове повторение символов
            char[] charLines = line.toCharArray();
            for (int i = 0; i < charLines.length && !isMatch; i++) {
                for (int j = 0; j < charLines.length; j++) {
                    if (i == j) continue;
                    if (charLines[i] == charLines[j]) {
                        isMatch = true;
                        break;
                    }
                }
            }
            if (!isMatch) {
                System.out.println(line);
                break;
            }

        }
    }
}
