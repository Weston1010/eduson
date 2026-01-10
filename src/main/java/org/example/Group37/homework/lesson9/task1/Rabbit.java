package org.example.Group37.homework.lesson9.task1;

public class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("Фыр - фыр");

    }

    @Override
    public void eat(String food) {
        if (food.equals("Grass")) {
            System.out.println("доволен");
        } else {
            System.out.println("недоволен");
        }
    }
}
