package com.thoughtworks;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<String> pattern = new ArrayList<>(Arrays.asList("黑桃", "梅花", "方片", "红桃"));
        List<String> figure = new ArrayList<>(Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"));

        List<Card> cards = getAllCards(pattern, figure);
        System.out.println(cards.size());
        CardMachine cardMachine = new CardMachine();
        System.out.println("已知牌的总数为52，请输入随机抽取牌的个数：");
        int n = new Scanner(System.in).nextInt();
        cardMachine.drawCard(cards, n);
    }

    public static List<Card> getAllCards(List<String> pattern, List<String> figure) {
        List<Card> cards = new ArrayList<>();
        for (String p : pattern) {
            for (String f : figure) {
                cards.add(new Card(p, f));
            }
        }
        return cards;
    }
}
