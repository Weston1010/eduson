package org.example.Group37.homework.lesson23.taskWithStar;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        Scanner scan = new Scanner(System.in);
        Composition comp = new Composition();
        System.out.println("Select the parser for the file:");
        System.out.println("1-SAX, 2-DOM");
        try {
            switch (scan.nextInt()) {
                case 1 -> writeCompositionFile(SaxParserComposition.xmlParseComposition());
                case 2 -> writeCompositionFile(DomParserComposition.xmlParseComposition(comp));
                default -> throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.err.println("Please enter a valid number.");
        }
    }

    public static void writeCompositionFile(Composition composition) {
        String path = String.format("src/main/resources/lesson23/%s_%s_%s.txt",
                composition.getFirstName(),
                composition.getLastName(),
                composition.getTitle());
        File newFile = new File(path);
        try {
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getAbsolutePath());
            } else {
                System.out.println("File already exists: " + newFile.getAbsolutePath());
            }
        } catch (IOException e) {
            System.err.println("Could not create file: " + e.getMessage());
        }
    }
}
