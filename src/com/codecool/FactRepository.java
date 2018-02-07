package com.codecool;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FactRepository {
    private List<Fact> facts = new ArrayList<>();

    public void addFact(Fact fact) {
        facts.add(fact);
    }

    public void removeFact(Fact fact) {
        facts.remove(fact);
    }

    public List<Fact> getFacts() {
        return facts;
    }

    public Iterator<Fact> getIterator() {
        Iterator<Fact> itr = facts.iterator();
        return itr;
    }

}