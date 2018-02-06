package com.codecool;

import java.util.Iterator;

public class RuleParser {
    Iterator<Question> iterator = new QuestionIterator();
    Question question;

    public RuleRepository getRuleRepository() {

    }

    public Iterator<Question> getIterator() {
        return iterator;
    }

    class QuestionIterator implements Iterator<Question> {
        public boolean hasNext() {
            return true;
        }

        public Question next() {
            return question;
        }
    }
}