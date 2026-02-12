package org.example.Group37.homework.lesson20.taskWithStar;

public class Manufacturer implements Runnable {
    //Задача *:
    //Имеются сущности Магазин, Производитель, Покупатель. Цель задачи сделать так, чтобы
    //производитель произвел 5 единиц продукта, а покупатель их купил. Пока производитель
    //не произвел продукт, покупатель не может его купить. При этом одновременно в магазине
    //может находиться не более 3 товаров.

    private int madeProduct;

    public Manufacturer() {
        madeProduct = 0;
    }

    public void productCreated() {
        synchronized (Shop.shop) {
            madeProduct++;
            Shop.productQuantity++;
            System.out.println("==Manufacturer==");
            System.out.println("Product created");
            System.out.println("Products made by an employee: " + madeProduct);
            System.out.println("Goods in stock: " + Shop.productQuantity);
            System.out.println("================");
            System.out.println();
        }
    }

    @Override
    public void run() {
        while (madeProduct < 5) {
            if (Shop.productQuantity < 3) {
                productCreated();
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}