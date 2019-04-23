package com.me.inner.mode.observer;

import com.me.inner.mode.ModeTest;

/**
 * Created by Me on 2019/4/21.
 * 观察者模式
 */
public class ObserverTest implements ModeTest {
    @Override
    public void test() {

        GraphObserver graphObserver = new GraphObserver();
        DigitObserver digitObserver = new DigitObserver();

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        randomNumberGenerator.addObserver(graphObserver);
        randomNumberGenerator.addObserver(digitObserver);

        randomNumberGenerator.execute();
    }
}
