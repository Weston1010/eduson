package org.example.Group37.homework.lesson12.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //Задача 1:
        //Вывести в консоль из строки которую пользователь вводит с клавиатуры все
        //аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
        //только из прописных букв, без чисел.

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("[A-Z]{2,6}");
        Matcher matcher = pattern.matcher(input);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group()).append(" ");
        }
        System.out.println("Последовательности из заглавных букв(2-6 символов): " + result.toString());
    }

}

