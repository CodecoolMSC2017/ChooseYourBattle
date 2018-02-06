package com.codecool;

import java.util.Iterator;

public class RuleRepository implements Iterator<Fact> {
    Iterator<Question> iterator = new QuestionIterator();
    Question question;
    
    public void addQuestion(Question question) {

    }

    public Iterator<Question> getIterator() {

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
