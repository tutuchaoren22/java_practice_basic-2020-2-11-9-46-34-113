package com.thoughtworks;

public class Card {
    private String pattern;
    private String figure;

    public Card() {
    }

    public Card(String pattern, String figure) {
        this.pattern = pattern;
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

    public String getPattern() {
        return pattern;
    }

    public String showCard() {
        return this.pattern + this.figure;
    }
}
