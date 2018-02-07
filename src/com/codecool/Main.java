package com.codecool;

public class Main {
    public static void main(String[] args) {

        FactParser factParser = new FactParser();
        RuleParser ruleParser = new RuleParser();
        ESProvider esp = new ESProvider(factParser, ruleParser);

        factParser.loadXmlDocument("./Data/Wars.xml");
        FactRepository wars = factParser.getFactRepository();

        for (Fact fact: wars.getFacts()) {
            System.out.println(fact.getName());
        }
    }
}
