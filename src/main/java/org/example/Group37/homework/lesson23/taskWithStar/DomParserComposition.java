package org.example.Group37.homework.lesson23.taskWithStar;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

class DomParserComposition {
    private final static Integer ZERO_INDEX = 0;

    public static Composition xmlParseComposition(Composition composition) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        String[] elements = {"lastName", "firstName", "title"};

        File file = new File("src/main/resources/lesson23/file1.xml");
        Document doc = factory.newDocumentBuilder().parse(file);
        doc.getDocumentElement().normalize();

        for (int i = 0; i < elements.length; i++) {
            NodeList nodeList = doc.getElementsByTagName(elements[i]);
            Node node = nodeList.item(ZERO_INDEX);
            if (!node.getTextContent().trim().isEmpty()) {
                switch (elements[i]) {
                    case "lastName" -> composition.setLastName(node.getTextContent());
                    case "firstName" -> composition.setFirstName(node.getTextContent());
                    case "title" -> composition.setTitle(node.getTextContent());
                }
            }
        }
        return composition;
    }
}
