package org.example.Group37.homework.lesson20.taskWithStar;

public class Shop {
    //Задача *:
    //Имеются сущности Магазин, Производитель, Покупатель. Цель задачи сделать так, чтобы
    //производитель произвел 5 единиц продукта, а покупатель их купил. Пока производитель
    //не произвел продукт, покупатель не может его купить. При этом одновременно в магазине
    //может находиться не более 3 товаров.

    protected static final Shop shop = new Shop();
    protected static int productQuantity = 0;

    public static void main(String[] args) {
        Manufacturer manufacturer = new Manufacturer();
        Buyer buyer = new Buyer();

        Thread thread1 = new Thread(manufacturer);
        Thread thread2 = new Thread(buyer);

        thread1.start();
        thread2.start();
    }
}