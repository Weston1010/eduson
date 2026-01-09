package org.example.Group37.homework.lesson6.task1;

public class Main {
    public static void main(String[] args) {
        //Задача 1:
        //Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
        //метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
        //который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
        //выводит текущую информацию о карточке. Напишите программу, которая создает три
        //объекта класса CreditCard у которых заданы номер счета и начальная сумма.
        //Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
        //третьей. Выведите на экран текущее состояние всех трех карточек.

        CreditCard creditCard = new CreditCard();
        CreditCard creditCard2 = new CreditCard();
        CreditCard creditCard3 = new CreditCard();
        CreditCard[] cards = {creditCard, creditCard2, creditCard3};

        for (CreditCard card : cards) {
            card.infoCard();
        }

        creditCard.accrualAmount(2000);
        creditCard2.accrualAmount(3000);
        creditCard3.debitingAmount(1500);


        for (CreditCard card : cards) {
            card.infoCard();
        }
    }
}
