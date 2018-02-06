package com.codecool;

public class Main {
    public static void main(String[] args) {

        FactParser factParser = new FactParser();
        RuleParser ruleParser = new RuleParser();
        ESProvider esp = new ESProvider(factParser, ruleParser);
    }
}
