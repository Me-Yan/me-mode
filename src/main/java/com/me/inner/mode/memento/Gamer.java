package com.me.inner.mode.memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by Me on 2019/4/22.
 */
public class Gamer {

    private int money;
    private List fruits;

    private Random random = new Random();
    private final String[] fruitName = {"西瓜", "苹果", "芒果", "火龙果", "车厘子"};

    public Gamer(int money) {
        this.money = money;
        fruits = new ArrayList();
    }

    public Memento createMemento() {
        Memento memento = new Memento(this.money);

        Iterator iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String temp = (String) iterator.next();
            if (temp.startsWith("好吃的")) {
                memento.addFruit(temp);
            }
        }

        return memento;
    }

    public void restoreGamer(Memento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("金钱增加了。");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("金钱减半了。");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("获得了水果(" + f + ")。");
            fruits.add(f);
        } else {
            System.out.println("什么都没有发生。");
        }
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }

        return prefix + fruitName[random.nextInt(fruitName.length)];
    }

    public String toString() {

        return "[money = "+ money +", fruits = "+ fruits +"]";
    }
}
