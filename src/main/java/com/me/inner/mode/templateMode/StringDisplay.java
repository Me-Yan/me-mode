package com.me.inner.mode.templateMode;

/**
 * Created by Me on 2019/4/8.
 */
public class StringDisplay extends AbstractDisplay {
    @Override
    public void open() {
        System.out.println("open...");
    }

    @Override
    public void close() {
        System.out.println("close...");
    }
}
