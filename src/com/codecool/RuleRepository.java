package com.codecool;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class RuleRepository {
    private List<Question> questions = new ArrayList<>();

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void removeQuestion(Question question) {
        questions.remove(question);
    }

    public Iterator<Question> getIterator() {
        Iterator<Question> iter = questions.iterator();
        return iter;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
