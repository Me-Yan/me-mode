package com.me.inner.mode.templateMode;

/**
 * Created by Me on 2019/4/8.
 */
public abstract class AbstractDisplay {

    public abstract void open();
    public abstract void close();
    public final void display() {
        open();
        System.out.println("display");
        close();
    }
}
