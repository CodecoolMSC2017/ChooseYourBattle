package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class SingleValue extends Value {
    private String singleValue;

    public SingleValue(String singleValue) {

        this.singleValue = singleValue;
    }

    public String getSingleValue() {
        return singleValue;
    }

    public List<String> getInputPattern(){
        List<String> validValues = new ArrayList<>();
        validValues.add(singleValue);
        return validValues;
    }

}