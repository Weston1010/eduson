package org.example.Group37.homework.lesson9.taskWithStar;

public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("РРР");

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

