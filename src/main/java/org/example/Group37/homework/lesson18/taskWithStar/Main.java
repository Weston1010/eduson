package org.example.Group37.homework.lesson18.taskWithStar;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Main {
    static class Name {
        String name;

        public Name(String name) {
            if (name == null) {
                throw new NullPointerException();
            }
            if (name.matches("\\d")) {
                throw new IllegalArgumentException();
            }

            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        //Задача *:
        //Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
        //этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
        //Среди отобранных значений отобрать только те, которые имеют нечетное количество
        //букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.

        HashMap<Integer, Name> map = new HashMap<>();
        fillMap(map);
        List<Name> nameList = editMap(map);
        nameList.forEach(name ->  System.out.println(name.getName()));
    }

    private static void fillMap(HashMap<Integer, Name> map) {
        String[] nameArray = {"Eleanor", "Alexander", "Evelyn", "William", "Sophia", "Elijah", "Amelia", "Benjamin ",
                "Isabella", "Henry", "Olivia", "Samuel", "Charlotte", "James", "Harper"};

        for (int i = 0; i < 15; i++) {
            map.put(i, new Name(nameArray[i]));
        }
    }

    private static List<Name> editMap(HashMap<Integer, Name> map) {
        Set<Integer> keys = Set.of(1, 2, 5, 8, 9, 13);

        return map.entrySet().stream()
                .filter(k -> keys.contains(k.getKey()))
                .filter(v -> v.getValue().getName().length() / 2 != 0)
                .map(v -> new Name(new StringBuilder(v.getValue().getName()).reverse().toString()))
                .toList();
    }
}