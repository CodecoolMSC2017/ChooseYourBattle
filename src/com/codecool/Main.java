package com.codecool;

public class Main {
    public static void main(String[] args) {

        FactParser factParser = new FactParser();
        RuleParser ruleParser = new RuleParser();
        /*ESProvider esp = new ESProvider(factParser, ruleParser);*/

        factParser.loadXmlDocument("./Data/Wars.xml");
        FactRepository wars = factParser.getFactRepository();

        ruleParser.loadXmlDocument("./Data/Rules.xml");
        RuleRepository rules = ruleParser.getRuleRepository();

        for (Question question: rules.getQuestions()) {
            System.out.println(question.getId());
            System.out.println(question.getQuestion());
        }
    }
}
