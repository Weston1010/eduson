package org.example.Group37.homework.lesson15.task2;

import java.util.LinkedList;

public class AnimalLinkedList {
    //Задача 2:
    //Создать класс, который будет хранить в себе коллекцию с названиями животных.
    //Реализовать методы удаления и добавления животных по следующим правилам:
    //добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
    //объекта этого класса в main методе другого класса.

    private LinkedList<String> listAnimals;

    public AnimalLinkedList() {
        listAnimals = new LinkedList<>();
        listAnimals.add("Cat");
        listAnimals.add("Dog");
        listAnimals.add("Elephant");
        listAnimals.add("Tiger");
        listAnimals.add("Ant");
    }

    public AnimalLinkedList(LinkedList<String> listAnimals) {
        this.listAnimals = listAnimals;
    }

    public void add(String animal) {
        listAnimals.addFirst(animal);
    }

    public void remove() {
        listAnimals.removeLast();
    }

    @Override
    public String toString() {
        StringBuilder line = new StringBuilder();
        for (String animal : listAnimals) {
            line.append(animal).append(" ");
        }
        return line.toString();
    }
}
