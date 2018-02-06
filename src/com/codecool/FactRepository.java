package com.codecool;

import java.util.Iterator;
import java.util.List;

public class FactRepository implements Iterator<Fact> {
    List<Fact> facts;

    public void addFact(Fact fact) {
        facts.add(fact);
    }

    public Iterator<Fact> getIterator {

    }
}