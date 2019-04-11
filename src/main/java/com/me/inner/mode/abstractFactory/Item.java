package com.me.inner.mode.abstractFactory;

/**
 * Created by yanyanghong on 2019/4/11.
 */
public abstract class Item {

    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract void doWhat();
}
