package com.me.inner.mode.observer;

/**
 * Created by Me on 2019/4/21.
 */
public class DigitObserver implements Observer {

    @Override
    public void update(NumberGenerator numberGenerator) {

        System.out.println("DigitObserver: " + numberGenerator.getNumber());

        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {

        }
    }
}
