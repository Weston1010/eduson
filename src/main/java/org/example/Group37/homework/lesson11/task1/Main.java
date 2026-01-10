package org.example.Group37.homework.lesson11.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
        //найденные строки и их длину.

        Scanner scan = new Scanner(System.in);

        String[] lines = {scan.nextLine(), scan.nextLine(), scan.nextLine()};
        String minValue = lines[0];
        String maxValue = lines[0];
        for (int i = 1; i < lines.length; i++) {
            if (minValue.length() > lines[i].length()) {
                minValue = lines[i];
            }
            if (maxValue.length() < lines[i].length()) {
                maxValue = lines[i];
            }
        }

        System.out.println(minValue + " " + minValue.length());
        System.out.println(maxValue + " " + maxValue.length());
        scan.close();
    }


}
