package com.me.inner.mode.bridge;

/**
 * Created by Me on 2019/4/11.
 */
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl display) {
        super(display);
    }

    public void multiDisplay(int times) {
        System.out.println("+");
        for (int i=0; i<times; i++) {
            System.out.println("-");
        }
        System.out.println("+");
    }
}
