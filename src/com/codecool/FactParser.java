package com.codecool;

import org.w3c.dom.Document;
import java.util.List;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class FactParser extends XMLParser {

    public FactRepository getFactRepository() {
        FactRepository wars = new FactRepository();
        Splitter splitApp = new Splitter();

        NodeList nList = document.getElementsByTagName("war");

        for (int temp = 0; temp < nList.getLength(); temp++) {

            Node nNode = nList.item(temp);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                String type = eElement.getElementsByTagName("type").item(0).getTextContent();
                String name = eElement.getElementsByTagName("name").item(0).getTextContent();
                String era = eElement.getElementsByTagName("era").item(0).getTextContent();
                Integer length = Integer.parseInt(eElement.getElementsByTagName("length").item(0).getTextContent());
                Long casualties = Long.parseLong(eElement.getElementsByTagName("length").item(0).getTextContent());

                String temp1 = eElement.getElementsByTagName("winners").item(0).getTextContent();
                String temp2 = eElement.getElementsByTagName("winners").item(0).getTextContent();

                List<String> winners = splitApp.splitter(temp1);
                List<String> losers = splitApp.splitter(temp2);

                Fact war = new Fact(type, name, era, winners, losers, length, casualties, 0);

                wars.addFact(war);
            }
        }
        return wars;
    }
}