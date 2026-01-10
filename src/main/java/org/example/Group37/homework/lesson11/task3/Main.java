package org.example.Group37.homework.lesson11.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
        //средней, а также их длину.

        Scanner scan = new Scanner(System.in);

        String[] lines = {scan.nextLine(), scan.nextLine(), scan.nextLine()};
        int middle = lines[lines.length / 2].length();
        for (String line : lines) {
            if (line.length() < middle) {
                System.out.println(line + " " + line.length());
            }
        }
    }
}