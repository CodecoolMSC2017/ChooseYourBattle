package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Splitter {

    public List<String> splitter(String toSplit) {
        List<String> split = new ArrayList<String>();
        for (String phrase : toSplit.split(",")) {
            split.add(phrase);
        }
        return split;
    }
}
