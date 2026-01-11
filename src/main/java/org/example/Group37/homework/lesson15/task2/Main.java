package org.example.Group37.homework.lesson15.task2;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Задача 2:
        //Создать класс, который будет хранить в себе коллекцию с названиями животных.
        //Реализовать методы удаления и добавления животных по следующим правилам:
        //добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
        //объекта этого класса в main методе другого класса.

        AnimalLinkedList animalLinkedList = new AnimalLinkedList();
        System.out.println(animalLinkedList.toString());

        animalLinkedList.add("Lion");
        System.out.println(animalLinkedList);

        animalLinkedList.remove();
        System.out.println(animalLinkedList);

        System.out.println();

        LinkedList<String> animals = new LinkedList<>();
        animals.add("Lion");
        animals.add("Fish");
        animals.add("Bird");
        animals.add("Bear");

        animalLinkedList = new AnimalLinkedList(animals);
        System.out.println(animalLinkedList.toString());

        animalLinkedList.add("Mouse");
        System.out.println(animalLinkedList);

        animalLinkedList.remove();
        System.out.println(animalLinkedList);
    }
}
