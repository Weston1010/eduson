package org.example.Group37.homework.lesson15.taskWithStar;

import java.util.Arrays;

public class MyArrayList<T> {
    /*
    Задача *:
    Представим, что в Java нет коллекции типа ArrayList. Создать свой класс, симулирующий
    работу класса динамической коллекции - т.е. создать свою кастомную коллекцию. В
    основе коллекции будет массив. Кастомная коллекция должна хранить элементы разных
    классов(т.е. это generic).

    Предусмотреть операции(методы):
    1. добавления элемента
    2. удаления элемента
    3. получение элемента по индексу
    4. проверка есть ли элемент в коллекции
    5. очистка всей коллекции

    Предусмотреть конструктор без параметров - создает массив размером
    по умолчанию. Предусмотреть конструктор с задаваемым размером внутреннего
    массива. Предусмотреть возможность автоматического расширения коллекции при
    добавлении элемента в том случае, когда коллекция уже заполнена.
    */

    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array;
    private int pointer = 0;

    public MyArrayList() {
        array = new Object[INIT_SIZE];
    }

    public MyArrayList(int initSize) {
        array = new Object[initSize];
    }

    public void add(T item) {
        if (pointer == array.length - 1)
            resize(array.length * 2); // увеличение в 2 раза, если достигли границ
        array[pointer++] = item;
    }

    public void remove(int index) {
        for (int i = index; i < pointer; i++)
            array[i] = array[i + 1];
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length / 2); // если элементов в CUT_RATE раз меньше чем
        // длина массива, то уменьшаем в два раза
    }

    public T get(int index) {
        return (T) array[index];
    }

    public boolean contains(Object o) {
        for (int i = 0; i < pointer; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        Arrays.fill(array, null);
        array = new Object[INIT_SIZE];
    }

    public int size() {
        return pointer;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}
