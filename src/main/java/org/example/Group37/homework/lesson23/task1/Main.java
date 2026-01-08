package org.example.Group37.homework.lesson23.task1;

import static org.example.Group37.homework.lesson23.task1.StaxParserComposition.*;

public class Main {
    public static void main(String[] args) {
        //Задача 1:
        //Написать программу для парсинга xml документа. Необходимо распарсить xml документ и
        //содержимое тегов line записать в другой документ. Название файла для записи должно
        //состоять из значений тегов и имеет вид: <firstName>_<lastName>_<title>.txt

        Composition composition = new Composition();
        writeCompositionFile(stax(composition));

    }
}
