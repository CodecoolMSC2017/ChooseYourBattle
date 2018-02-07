package com.codecool;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.util.List;

public class RuleParser extends XMLParser {
    RuleRepository rules = new RuleRepository();
    Splitter splitApp = new Splitter();

    public RuleRepository getRuleRepository() {
        NodeList nList = document.getElementsByTagName("Rule");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node ruleNode = nList.item(temp);
            if (ruleNode.getNodeType() == Node.ELEMENT_NODE) {
                Element ruleElement = (Element) ruleNode;
                String questionId = ruleElement.getAttribute("id");
                String question = ruleElement.getElementsByTagName("Question").item(0).getTextContent();

    }
}