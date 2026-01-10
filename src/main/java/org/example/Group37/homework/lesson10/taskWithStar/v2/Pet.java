package org.example.Group37.homework.lesson10.taskWithStar.v2;

public class Pet implements Cloneable {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
