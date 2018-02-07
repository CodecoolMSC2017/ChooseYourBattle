package com.codecool;

import java.util.Iterator;
import java.util.List;

public class RuleRepository {
    private List<Question> questions;

    public void addFact(Question question) {
        questions.add(question);
    }

    public void removequestion(Question question) {
        questions.remove(question);
    }

    public Iterator<Question> getIterator() {
        Iterator<Question> iter = questions.iterator();
        return iter;
    }
}
