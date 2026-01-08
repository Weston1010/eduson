package org.example.Group37.homework.lesson23.task1;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class StaxParserComposition {
    public static Composition stax(Composition composition) {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        try (FileInputStream inputStream = new FileInputStream("src/main/resources/lesson23/file1.xml")) {
            XMLStreamReader reader = factory.createXMLStreamReader(inputStream);

            while (reader.hasNext()) {
                reader.next();
                if (reader.isStartElement() && reader.hasNext()) {
                    String localName = reader.getLocalName();
                    switch (localName) {
                        case "firstName" -> {
                            reader.next();
                            if (reader.hasText() && !reader.getText().trim().isEmpty()) {
                                composition.setFirstName(reader.getText());
                            }
                        }
                        case "lastName" -> {
                            reader.next();
                            if (reader.hasText() && !reader.getText().trim().isEmpty()) {
                                composition.setLastName(reader.getText());
                            }
                        }
                        case "title" -> {
                            reader.next();
                            if (reader.hasText() && !reader.getText().trim().isEmpty()) {
                                composition.setTitle(reader.getText());
                            }
                        }
                    }
                }
            }
            reader.close();
        } catch (IOException | XMLStreamException e) {
            e.printStackTrace();
        }
        return composition;
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
