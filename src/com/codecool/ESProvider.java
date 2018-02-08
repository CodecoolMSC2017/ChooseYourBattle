package com.codecool;

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
            System.out.println(question.getQuestion());
            System.out.println("Possible answers:");
            List<Value> possibleAnswers = question.getAnswer().getValues();
            for (int i=0; i<possibleAnswers.size(); i++) {
                if (possibleAnswers.get(i) instanceof SingleValue) {
                    System.out.println((possibleAnswers.get(i).getInputPattern()).get(0));
                }else {
                    List<String> correctAnswers = possibleAnswers.get(i).getInputPattern();
                    for (int j=0; j<correctAnswers.size();j++) {
                        System.out.println(correctAnswers.get(j));
                    }
                }

            }
            String uinput = (scanner.nextLine()).toLowerCase();
            evaluate();
        }
    }

    public String getAnswerByQuestion(String questionId) {
        return "Whatever";
    }

    public String evaluate() {
        return getAnswerByQuestion(null);
    }
}