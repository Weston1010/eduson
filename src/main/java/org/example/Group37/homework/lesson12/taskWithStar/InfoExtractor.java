package org.example.Group37.homework.lesson12.taskWithStar;

import java.util.regex.*;
import java.util.Scanner;

public class InfoExtractor {
    public static void main(String[] args) {
        //Задача *:
        //Программа на вход получает произвольный текст. В этом тексте может быть номер
        //документа(один или несколько), емейл и номер телефона. Номер документа в формате:
        //xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
        //может содержать не всю информацию, т.е. например, может не содержать номер
        //телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
        //формате:
        //email: teachmeskills@gmail.com
        //document number: 1423-1512-51
        //и т.д

        Scanner console = new Scanner(System.in);

        System.out.println("Введите текст:");
        String input = console.nextLine();

        String emailPattern = "[\\w-\\.]+@[\\w-]+(\\.[\\w-]+)*\\.[a-z]{2,}";
        String docPattern = "\\d{4}-\\d{4}-\\d{2}";
        String phonePattern = "\\+\\(\\d{2}\\)\\d{7}";

        Pattern emailRegex = Pattern.compile(emailPattern);
        Pattern docRegex = Pattern.compile(docPattern);
        Pattern phoneRegex = Pattern.compile(phonePattern);

        Matcher emailMatcher = emailRegex.matcher(input);
        Matcher docMatcher = docRegex.matcher(input);
        Matcher phoneMatcher = phoneRegex.matcher(input);

        if (emailMatcher.find()) {
            System.out.println("email: " + emailMatcher.group());
        }

        if (docMatcher.find()) {
            System.out.println("document number: " + docMatcher.group());
        }

        if (phoneMatcher.find()) {
            System.out.println("phone: " + phoneMatcher.group());
        }
    }
}