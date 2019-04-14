package com.me.inner.mode.decorator;

/**
 * Created by Me on 2019/4/14.
 */
public abstract class Display {

    public abstract int getRows();

    public abstract int getColumns();

    public abstract String getRowText(int row);

    public final void show() {
        for (int i=0; i<getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
