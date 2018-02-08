package com.codecool;

import java.util.List;

public class Fact {
    private String type;
    private String name;
    private String era;
    private List<String> winners;
    private List<String> losers;
    private String length;
    private Long casualties;
    private Integer score = 0;

    public Fact(String type, String name, String era, List<String> winners, List<String> losers, String length, Long casualties, Integer score) {
        this.type = type;
        this.name = name;
        this.era = era;
        this.winners = winners;
        this.losers = losers;
        this.length = length;
        this.casualties = casualties;
        this.score = score;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getEra() {
        return era;
    }

    public List<String> getWinners() {
        return winners;
    }

    public List<String> getLosers() {
        return losers;
    }

    public String getLength() {
        return length;
    }

    public Long getCasualities() {
        return casualties;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer add) {
        score += add;
    }
}