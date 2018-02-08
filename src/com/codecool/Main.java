package com.codecool;

public class Main {
    public static void main(String[] args) {

        FactParser factParser = new FactParser();
        factParser.loadXmlDocument("./Data/Wars.xml");
        RuleParser ruleParser = new RuleParser();
        ruleParser.loadXmlDocument("./Data/Rules.xml");
        ESProvider esp = new ESProvider(factParser, ruleParser);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Welcome to ChooseYourBattle!");
        System.out.println("We can offer you the war/battle best fit for your personality.");
        System.out.println("Do you wish to read/participate in a short but bloody war? A long but quiet one? We got it for you!");
        System.out.println("Just answer the following questions:");

        esp.collectAnswers();

        /*factParser.loadXmlDocument("./Data/Wars.xml");
        FactRepository wars = factParser.getFactRepository();

        ruleParser.loadXmlDocument("./Data/Rules.xml");
        RuleRepository rules = ruleParser.getRuleRepository();

        for (Question question: rules.getQuestions()) {
            System.out.println(question.getId());
            System.out.println(question.getQuestion());
        }*/
    }
}
