package org.example.Group37.homework.lesson10.task1;


public class Main {
    public static void main(String[] args) {

        User user = new User("Bob", "boblike@yandex", 21);
        User user1 = new User("Bob", "boblike@yandex", 21);

        boolean result = user.equals(user1);
        System.out.println(result);
    }
}