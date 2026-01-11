package org.example.Group37.homework.lesson16.taskWithStar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Задача *:
        //Задана строка, которая может иметь внутри себя скобки. Скобкой считается
        //любой из следующих символов — «(«, «)», «[«, «]», «{«, «}». Проверить
        //сбалансированность расстановки скобок в этой строке. Набор скобок считается
        //сбалансированной парой, если открывающая скобка "(", "[" и "{" стоит слева от
        //соответствующей закрывающей скобки ")", "]" и "} ", соответственно. Строка,
        //содержащая пары скобок, не сбалансирована, если набор заключенных в нее
        //скобок не совпадает.

        //Например, если ввод «{[(])}», пара квадратных скобок «[]» заключает в себя
        //одну несбалансированную открывающую круглую скобку «(». Аналогично, пара
        //круглых скобок «() ", заключает в себя одну несбалансированную
        //закрывающую квадратную скобку "]". Таким образом, входная строка "{[(])}"
        //несбалансированная.

        //Пример
        List<String> strings = new ArrayList<>(6);
        strings.add("()"); // - сбалансирована
        strings.add("[()]"); // - сбалансирована
        strings.add("{[()]}"); // - сбалансирована
        strings.add("([{{[(())]}}])"); // - сбалансирована
        strings.add("{{[]()}}}}"); // - не сбалансирована
        strings.add("{[(])}"); // - не сбалансирована
        strings.add("{([)}");

        for (String string : strings) {
            print(string, checkBalance(string));
        }
    }

    private static boolean checkBalance(String string) {
        string = string.trim();
        if (string.isEmpty() || string.length() % 2 != 0) {
            return false;
        }

        final Map<Character, Character> map = new HashMap<>(6);
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');


        boolean isBalance = true;
        for (int i = 0, j = string.length() - 1; i <= j; i++, j--) {
            char firstChar = string.charAt(i);
            char lastChar = string.charAt(j);
            if (map.containsKey(firstChar) && map.get(firstChar) != lastChar) {
                return false;
            }
        }
        return isBalance;
    }

    private static void print(String string, boolean balance) {
        if (balance) {
            System.out.println(string + " - сбалансирована");
        } else {
            System.out.println(string + " - не сбалансирована");
        }
    }
}
