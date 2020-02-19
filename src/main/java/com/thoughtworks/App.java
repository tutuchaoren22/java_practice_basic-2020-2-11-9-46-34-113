package com.thoughtworks;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Card> cards = getAllCards();
        CardMachine cardMachine = new CardMachine();
        System.out.println("已知牌的总数为" + cards.size() + "，请输入随机抽取牌的个数：");
        cardMachine.drawCard(cards, new Scanner(System.in).nextInt());
    }

    public static List<Card> getAllCards() {
        List<Card> cards = new ArrayList<>();
        for (Pattern pattern : Pattern.values()) {
            for (Figure figure : Figure.values()) {
                cards.add(new Card(pattern, figure));
            }
        }
        return cards;
    }
}
