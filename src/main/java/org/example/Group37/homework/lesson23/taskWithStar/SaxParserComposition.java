package org.example.Group37.homework.lesson23.taskWithStar;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

class SaxParserComposition extends DefaultHandler {
    private Composition composition;
    private boolean isLastName;
    private boolean isFirstName;
    private boolean ifTitle;

    @Override
    public void startDocument() {
        composition = new Composition();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        switch (qName) {
            case "lastName" -> isLastName = true;
            case "firstName" -> isFirstName = true;
            case "title" -> ifTitle = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        if (isLastName) {
            composition.setLastName(String.valueOf(ch, start, length));
            isLastName = false;
        }
        if (isFirstName) {
            composition.setFirstName(String.valueOf(ch, start, length));
            isFirstName = false;
        }
        if (ifTitle) {
            composition.setTitle(String.valueOf(ch, start, length));
            ifTitle = false;
        }
    }

    public static Composition xmlParseComposition() {
        SaxParserComposition parserComposition = new SaxParserComposition();

        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse(new File("src/main/resources/lesson23/file1.xml"), parserComposition);
        } catch (SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }

        return parserComposition.composition;
    }
}
