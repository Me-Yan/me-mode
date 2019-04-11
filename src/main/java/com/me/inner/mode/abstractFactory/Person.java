package com.me.inner.mode.abstractFactory;

/**
 * Created by yanyanghong on 2019/4/11.
 */
public abstract class Person extends Item {

    protected String type;

    public Person(String caption, String type) {
        super(caption);
        this.type = type;
    }
}
