package com.codecool;

import java.util.List;

public class Answer {
    private List<Value> values;

    public Answer(List<Value> values) {
        this.values = values;
    }

    public String evaluateAnswerByInput(String input) {
        for (Value value : values) {
            if (value.getInputPattern().equals(input)) {
                return input;
            }
        }
        return "Incorrect input!";
    }

    public void addValue(Value value) {
        values.add(value);
    }
}
