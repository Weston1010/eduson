package org.example.Group37.homework.lesson17.task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задача 1:
        //Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
        //когда пользователю исполнится 100 лет. Использовать Date/Time API.

        Scanner scan = new Scanner(System.in);
        System.out.println("Видите дату своего рождения в формате гггг-мм-дд");
        LocalDate birthDate = LocalDate.parse(scan.nextLine());
        LocalDate birthdayHundredYears = birthDate.plusYears(100);
        String date = birthdayHundredYears.format(DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        int yearsLeft = birthdayHundredYears.getYear() - LocalDate.now().getYear();
        System.out.printf("В %s вам исполнится 100 лет. Это через %d лет/года", date, yearsLeft);
    }

}
