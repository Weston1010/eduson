package org.example.Group37.homework.lesson6.taskWithStar;

public class Atm {
    //Задача *:
    //Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
    //задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100. Сделать
    //метод для добавления денег в банкомат. Сделать функцию, снимающую деньги, которая
    //принимает сумму денег, а возвращает булевое значение - успешность выполнения
    //операции. При снятии денег, функция должна распечатывать каким количеством купюр
    //какого номинала выдаётся сумма. Создать конструктор с тремя параметрами -
    //количеством купюр каждого номинала.

    private int quantityBanknote100;
    private int quantityBanknote50;
    private int quantityBanknote20;

    public Atm(int quantityBanknote100, int quantityBanknote50, int quantityBanknote20) {
        this.quantityBanknote100 = quantityBanknote100;
        this.quantityBanknote50 = quantityBanknote50;
        this.quantityBanknote20 = quantityBanknote20;
    }

    public void addBanknote(int quantityBanknote100, int quantityBanknote50, int quantityBanknote20) {
        this.quantityBanknote100 += quantityBanknote100;
        this.quantityBanknote50 += quantityBanknote50;
        this.quantityBanknote20 += quantityBanknote20;
    }

    public boolean withdrawMoney(int amount) {
        if (amount > quantityBanknote20 * 20 + quantityBanknote50 * 50 + quantityBanknote100 * 100) {
            return false;
        }

        int amount1 = amount;



        int banknote100 = amount / 100;

        if (banknote100 > quantityBanknote100) {
            return false; // если нет столько банкнот по 100
        }

        amount1 -= banknote100 * 100;

        int banknote50 = amount1 / 50;

        if (banknote50 > quantityBanknote50) {
            return false; // если нет столько банкнот по 50
        }

        amount1 -= banknote50 * 50;

        int banknote20 = amount1 / 20;

        if (banknote20 > quantityBanknote20) {
            return false; // если нет столько банкнот по 20
        }

        amount1 -= banknote20 * 20;

        if (amount1 != 0) {

            banknote20 = amount / 20;

            if (banknote20 > quantityBanknote20) {
                return false;
            }

            amount -= banknote20 * 20;

            if (amount != 0) {
                return false;
            } else {
                quantityBanknote20 -= banknote20;
                System.out.println("Выдача " + banknote20 + " банкнот по 20");

                return true;
            }
        } else {
            quantityBanknote100 -= banknote100;
            System.out.println("Выдача " + banknote100 + " банкнот по 100");

            quantityBanknote50 -= banknote50;
            System.out.println("Выдача " + banknote50 + " банкнот по 50");

            quantityBanknote20 -= banknote20;
            System.out.println("Выдача " + banknote20 + " банкнот по 20");

            return true;
        }
    }
}
