package com.thoughtworks;

public class Card {
    private Pattern pattern;
    private Figure figure;

    public Card() {
    }

    public Card(Pattern pattern, Figure figure) {
        this.pattern = pattern;
        this.figure = figure;
    }

    public String showCard() {
        return this.pattern.getPattern() + this.figure.getFigure();
    }
}
