package org.example.Group37.homework.lesson15.task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Задача 3:
        //Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
        //оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
        //Написать метод, который удаляет студентов со средним баллом <3. Если средний
        //балл>=3, студент переводится на следующий курс. Дополнительно написать метод
        //printStudents(List<Student> students, int course), который получает список студентов и
        //номер курса. А также печатает на консоль имена тех студентов из списка, которые
        //обучаются на данном курсе.

        List<Student> students = new ArrayList<>();
        students.add(new Student("Boris", 302, 3, 5));
        students.add(new Student("Sasha", 101, 1, 3));
        students.add(new Student("Misha", 470, 4, 2));
        students.add(new Student("Vasya", 412, 4, 4));

        printStudents(students, 4);
        removeLaggards(students);

    }

    public static void removeLaggards(List<Student> students) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getGrades() < 3) {
                System.out.printf("%s из группы %d был(а) отчислен(а) из-за низкого балла",
                        student.getName(), student.getGroup());
                iterator.remove();
            } else {
                student.setGroup(student.getGroup() + 100);
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
