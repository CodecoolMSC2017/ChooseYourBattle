package com.codecool;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.Arrays;
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
                String newQuestion = ruleElement.getElementsByTagName("Question").item(0).getTextContent();
                Node answerNode = ruleElement.getElementsByTagName("Answer").item(0);
                List<Value> valueList = new ArrayList<>();
                Element answerElement = (Element) answerNode;
                NodeList selectionList = answerElement.getElementsByTagName("Selection");
                for (int tempSelection = 0; tempSelection < selectionList.getLength(); tempSelection++) {
                    Node selectionNode = selectionList.item(tempSelection);
                    if (selectionNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element selectionElement = (Element) selectionNode;
                        NodeList singleValueList = selectionElement.getElementsByTagName("SingleValue");
                        NodeList multipleValueList = selectionElement.getElementsByTagName("MultipleValue");
                        if (singleValueList.getLength() > 0) {
                            Element single = (Element)singleValueList.item(0);
                            Value singleValue = new SingleValue(single.getAttribute("value"));
                            valueList.add(singleValue);
                        } else {
                            Element multiple = (Element)multipleValueList.item(0);
                            String multipleValues = multiple.getAttribute("value");
                            List<String> splittedMultipleValues = Arrays.asList(multipleValues.split(","));
                            Value multipleValue = new MultipleValue(splittedMultipleValues);
                            valueList.add(multipleValue);
                        }
                    }
                }
                Answer answer = new Answer(valueList);
                Question question = new Question(questionId, newQuestion, answer);
                rules.addQuestion(question);
            }
        }
        return rules;
    }
}