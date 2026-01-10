package org.example.Group37.homework.lesson14.task2;

import java.io.*;
import java.util.Scanner;

public class DocumentValidator {
    public static void main(String[] args) {
        //Задача *:
        //Допустим есть txt файл с номерами документов. Номером документа является строка,
        //состоящая из букв и цифр(без служебных символов). Пусть этот файл содержит каждый
        //номер документа с новой строки и в строке никакой другой информации, только номер
        //документа. Валидный номер документа должен иметь длину 15 символов и начинаться с
        //последовательности docnum(далее любая последовательность букв/цифр) или
        //contract(далее любая последовательность букв/цифр). Написать программу для чтения
        //информации из входного файла - путь к входному файлу должен задаваться через
        //консоль. Программа должна проверять номера документов на валидность. Валидные
        //номера документов следует записать в один файл-отчет. Невалидные номера документов
        //следует записать в другой файл-отчет, но после номеров документов следует добавить
        //информацию о том, почему этот документ не валиден.

        String inputPath;
        try (Scanner scanner = new Scanner(System.in)) {
            inputPath = scanner.nextLine();
        }

        String validOutputPath = "src/main/resources/lesson14/valid_documents.txt";
        String invalidOutputPath = "src/main/resources/lesson14/invalid_documents.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath))) {
            while (reader.ready()) {
                String document = reader.readLine().trim();
                if (isValidDocument(document)) {
                    writeToValidFile(document, validOutputPath);
                } else {
                    String reason = getInvalidReason(document);
                    writeToInvalidFile(document, reason, invalidOutputPath);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }

    private static boolean isValidDocument(String document) {
        return document.replace("\uFEFF", "").length() == 15 &&
                (document.startsWith("docnum") || document.startsWith("contract"));
    }

    private static void writeToValidFile(String document, String outputPath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath, true))) {
            writer.write(document + "\n");
        }
    }

    private static void writeToInvalidFile(String document, String reason, String outputPath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath, true))) {
            writer.write(document + " - " + reason + "\n");
        }
    }

    private static String getInvalidReason(String document) {
        if (document.length() != 15) {
            return "Длина документа не равна 15 символам";
        }
        if (!document.startsWith("docnum") && !document.startsWith("contract")) {
            return "Не начинается с 'docnum' или 'contract'";
        }
        return "Невалидный формат документа";
    }
}