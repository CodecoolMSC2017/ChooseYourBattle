package com.codecool;

import java.util.List;

public class Fact {
    private String type;
    private String name;
    private String era;
    private List<String> winners;
    private List<String> losers;
    private Integer length;
    private Long casualities;

    public Fact(String type, String name, String era, List<String> winners, List<String> losers, Integer length, Long casualities) {
        this.type = type;
        this.name = name;
        this.era = era;
        this.winners = winners;
        this.losers = losers;
        this.length = length;
        this.casualities = casualities;
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

    public Integer getLength() {
        return length;
    }

    public Long getCasualities() {
        return casualities;
    }
}