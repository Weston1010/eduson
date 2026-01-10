package org.example.Group37.homework.lesson7.taskWithStar;

public class Main {
    public static void main(String[] args) {
        try {
            Cat cat1 = new Cat("Leopold", 21);
            Cat cat2 = cat1;
            Cat cat3 = (Cat) cat1.clone();
            System.out.println(cat1 == cat2);
            System.out.println(cat1 == cat3);
            System.out.println(cat2 == cat3);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
