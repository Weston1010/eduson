package org.example.Group37.homework.lesson9.task1;

public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("РРР");

    }

    @Override
    public void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("доволен");
        } else if (food.equals("Grass")) {
            System.out.println("недоволен");
        }
    }
}

