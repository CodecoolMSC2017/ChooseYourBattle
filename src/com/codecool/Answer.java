package com.codecool;

import java.util.List;

public class Answer {
    private List<Value> values;

    public Answer(List<Value> values) {
        this.values = values;
    }

    public boolean evaluateAnswerByInput(String input) {
        for (Value value : values) {
            if (value.getInputPatter().contains(input)) {
                return true;
            }
        }
        return false;
    }

    public void addValue(Value value) {
        values.add(value);
    }
}
