package org.example.Group37.homework.lesson9.task1;

public class Dog extends Animal {

    @Override
    public void voice() {
        System.out.println("Гав - гав");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meet")) {
            System.out.println("доволен");
        } else {
            System.out.println("недоволен");
        }
    }
}
