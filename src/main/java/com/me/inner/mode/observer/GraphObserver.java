package com.me.inner.mode.observer;

/**
 * Created by Me on 2019/4/21.
 */
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator numberGenerator) {

        System.out.print("GraphObserver: " + numberGenerator.getNumber());

        int count = numberGenerator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }

        System.out.println();
    }
}
