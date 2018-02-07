package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class MultipleValue extends Value{
    private List<String> multipleValues = new ArrayList<>();

    public MultipleValue(List<String> multipleValues) {
        this.multipleValues = multipleValues;
    }

    public List<String> getMultipleValue() {
        return multipleValues;
    }

    public List<String> getInputPattern() {
        List<String> validValues = multipleValues;
        return validValues;
    }
}
