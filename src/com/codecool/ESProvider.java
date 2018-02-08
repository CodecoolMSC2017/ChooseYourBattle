package com.codecool;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ESProvider {
    private FactRepository factRepository;
    private RuleRepository ruleRepository;
    private Scanner scanner = new Scanner(System.in);

    public ESProvider(FactParser factParser, RuleParser ruleParser) {
        this.factRepository = factParser.getFactRepository();
        this.ruleRepository = ruleParser.getRuleRepository();
    }

    public void collectAnswers() {
        Iterator<Question> ruleIter = ruleRepository.getIterator();
        while (ruleIter.hasNext()) {
            Question question = ruleIter.next();
            while (true) {
                System.out.println(question.getQuestion());
                System.out.println("Possible answers:");
                List<Value> possibleAnswers = question.getAnswer().getValues();
                for (int i = 0; i < possibleAnswers.size(); i++) {
                    if (possibleAnswers.get(i) instanceof SingleValue) {
                        System.out.println((possibleAnswers.get(i).getInputPattern()).get(0));
                    } else {
                        List<String> correctAnswers = possibleAnswers.get(i).getInputPattern();
                        for (int j = 0; j < correctAnswers.size(); j++) {
                            System.out.println(correctAnswers.get(j));
                        }
                    }
                }
                String uinput = question.getEvaulatedAnswer(scanner.nextLine().toLowerCase());
                if (uinput.equals("Incorrect input!")) {
                    System.out.println("Incorrect input!");
                    continue;
                } else {
                    setScore(uinput, question.getId());
                    break;
                }
            }
        }
    }

    public void setScore(String uinput, String questionID) {
        Iterator<Fact> factIter = factRepository.getIterator();
        while (factIter.hasNext()) {
            if (questionID.equals("type")) {
                Fact checkValue = factIter.next();
                if (checkValue.getType().equals(uinput)) {
                    checkValue.setScore(1);
                }
            }else if (questionID.equals("era")) {
                Fact checkValue = factIter.next();
                if (checkValue.getEra().equals(uinput)) {
                    checkValue.setScore(1);
                }
            }else if (questionID.equals("winners")) {
                Fact checkValue = factIter.next();
                if (checkValue.getType().equals(uinput)) {
                    checkValue.setScore(1);
                }
            }else if (questionID.equals("length")) {
                Fact checkValue = factIter.next();
                if (checkValue.getType().equals(uinput)) {
                    checkValue.setScore(1);
                }
            }
        }
    }

    public List<Fact> evaluate() {
        int maxScore = 0;
        List<Fact> bestFits = new ArrayList<>();
        for (Fact fact : factRepository.getFacts()) {
            if (fact.getScore() > maxScore) {
                maxScore = fact.getScore();
                bestFits.clear();
                bestFits.add(fact);
            }else if (fact.getScore() == maxScore) {
                bestFits.add(fact);
            }
        }
        return bestFits;
    }
}