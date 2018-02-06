package com.codecool;

import java.util.List;

public class MultipleValue extends Value{

    public List<String> MultipleValue;

    public MultipleValue(List<String> multipleValue) {
        MultipleValue = multipleValue;
    }

    public List<String> getMultipleValue() {
        return MultipleValue;
    }
}
