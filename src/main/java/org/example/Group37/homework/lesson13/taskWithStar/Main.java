package org.example.Group37.homework.lesson13.taskWithStar;

public class Main {
    //Задача *:
    //Написать try/catch/finally, в котором finally вызван не будет.

    public static void main(String[] args) {
        try {
            System.out.println("Блок try");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Блок catch");
            System.exit(0);
        } finally {
            System.out.println("Блок finally");
        }
    }

}
