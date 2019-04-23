package com.me.inner.mode.memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Me on 2019/4/22.
 */
public class Memento {

    private int money;
    private List fruits;

    public Memento(int money) {
        this.money = money;
        fruits = new ArrayList();
    }

    public void addFruit(String name) {
        fruits.add(name);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public List getFruits() {
        List list = new ArrayList();

        Iterator iterator = fruits.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }

        return list;
    }

    public void setFruits(List fruits) {
        this.fruits = fruits;
    }
}
