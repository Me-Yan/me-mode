package com.me.inner.mode.decorator;

/**
 * Created by Me on 2019/4/14.
 */
public abstract class Border extends Display {

    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}
