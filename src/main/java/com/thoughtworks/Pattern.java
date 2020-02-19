package com.thoughtworks;

public enum Pattern {
    SPADE("黑桃"),
    CLUB("梅花"),
    DIAMOND("方片"),
    HEART("红桃");

    private String pattern;

    Pattern(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }
}
