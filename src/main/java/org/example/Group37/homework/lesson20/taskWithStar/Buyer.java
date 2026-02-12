package org.example.Group37.homework.lesson20.taskWithStar;

public class Buyer implements Runnable {
    //Задача *:
    //Имеются сущности Магазин, Производитель, Покупатель. Цель задачи сделать так, чтобы
    //производитель произвел 5 единиц продукта, а покупатель их купил. Пока производитель
    //не произвел продукт, покупатель не может его купить. При этом одновременно в магазине
    //может находиться не более 3 товаров.

    private int purchasedProduct;

    public Buyer() {
        purchasedProduct = 0;
    }

    public void buyProduct() {
        synchronized (Shop.shop) {
            if (Shop.productQuantity > 0) {
                purchasedProduct++;
                Shop.productQuantity--;
                System.out.println("------Buyer------");
                System.out.println("Buy product");
                System.out.println("Now he has products: " + purchasedProduct);
                System.out.println("Goods in stock: " + Shop.productQuantity);
                System.out.println("-----------------");
                System.out.println();
            }
        }
    }

    @Override
    public void run() {
        while (purchasedProduct < 5) {
            buyProduct();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}