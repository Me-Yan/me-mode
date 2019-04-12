package com.me.inner.mode.strategy;

import java.util.LinkedList;

/**
 * Created by Me on 2019/4/12.
 */
public class Select {

    private String name;
    private Strategy strategy;

    public Select(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public void output() {
        strategy.output();
    }

    public void insertData(int[] list) {
        strategy.setDataList(list);
    }
}
