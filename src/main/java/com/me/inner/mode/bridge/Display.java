package com.me.inner.mode.bridge;

/**
 * Created by Me on 2019/4/11.
 */
public class Display {

    private DisplayImpl display;

    public Display(DisplayImpl display) {
        this.display = display;
    }

    public void open() {
        display.rawOpen();
    }

    public void print() {
        display.rawPrint();
    }

    public void close() {
        display.rawClose();
    }

    public void display() {
        open();
        print();
        close();
    }
}
