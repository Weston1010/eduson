package org.example.Group37.homework.lesson6.task1;

public class CreditCard {
    //Задача 1:
    //Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
    //метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
    //который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
    //выводит текущую информацию о карточке. Напишите программу, которая создает три
    //объекта класса CreditCard у которых заданы номер счета и начальная сумма.
    //Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
    //третьей. Выведите на экран текущее состояние всех трех карточек.

    private final String numCard;
    private int sumCard;

    public CreditCard() {
        int min = 1000_0000;
        int max = 9999_9999;
        // генерация 16-го номера карты
        numCard = (min + (int) (Math.random() * (max - min + 1))) + ""
                + (min + (int) (Math.random() * (max - min + 1)));
        sumCard = 5000;
    }

    public void accrualAmount(int cash) {
        sumCard += cash;
    }

    public void debitingAmount(int cash) {
        sumCard -= cash;
    }

    public void infoCard () {
        System.out.println("Номер карты: " + numCard);
        System.out.println("Сумма на карте: " + sumCard);
        System.out.println();
    }
}
