package com.me.inner.mode.observer;

import java.util.Random;

/**
 * Created by Me on 2019/4/21.
 */
public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();

    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i=0; i < 20; i++) {
            number = random.nextInt(50);
            noticeObserver(this);
        }
    }
}
