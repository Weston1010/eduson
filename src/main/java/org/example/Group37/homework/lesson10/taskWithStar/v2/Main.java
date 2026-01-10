package org.example.Group37.homework.lesson10.taskWithStar.v2;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Pet pet = new Pet("Barsic", 21);
        User user = new User("Bob", "boblike@yandex", 21, pet, 103762736);
        User user1 = (User) user.clone();

        System.out.println(user == user1);
        System.out.println(user.getPet() == user1.getPet());
    }
}