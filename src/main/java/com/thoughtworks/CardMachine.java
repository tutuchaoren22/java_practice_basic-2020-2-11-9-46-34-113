package com.thoughtworks;

import java.util.List;
import java.util.Random;

public class CardMachine {
    private Random r = new Random();

    public void drawCard(List<Card> cards, int n) {
        if (n <= cards.size()) {
            for (int i = 0; i < n; i++) {
                int index = r.nextInt(cards.size());
                System.out.println(cards.get(index).showCard());
            }
        } else {
            System.out.println("输入的数值有误！");
        }
    }
}
