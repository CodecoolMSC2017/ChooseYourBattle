package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Answer {
    private List<Value> values = new ArrayList<>();

    public Answer(List<Value> values) {
        for (Value value : values) {
            this.addValue(value);
        }
    }

    public String evaluateAnswerByInput(String input) {
        for (Value value : values) {
            List<String> validValues = value.getInputPattern();
            for (String entry : validValues) {
                if (entry.equals(input)) {
                    return input;
                }
            }
        }
        return "Incorrect input!";
    }

    public void addValue(Value value) {
        values.add(value);
    }
}
