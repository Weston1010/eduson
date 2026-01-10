package org.example.Group37.homework.lesson8.taskWithStar;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception{
        Apple apple = new Apple("красный");
        apple.printColor();

        Field colorFiled = Apple.class.getDeclaredField("color");
        colorFiled.setAccessible(true);
        colorFiled.set(apple, "зеленый");
        apple.printColor();
    }
}
