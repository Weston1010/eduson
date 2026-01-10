package org.example.Group37.homework.lesson7.task2;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle(21, 14, 17);
        shapes[1] = new Circle(12);
        shapes[2] = new Rectangle(13, 23);
        shapes[3] = new Rectangle(34, 43);
        shapes[4] = new Circle(14);

        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getPerimeter();
        }

        System.out.println(sum);
    }
}
