package com.me.inner.mode.abstractFactory;

/**
 * Created by yanyanghong on 2019/4/11.
 */
public abstract class Computer extends Item {

    protected String type;

    public Computer(String caption, String type) {
        super(caption);
        this.type = type;
    }
}
