package com.me.inner.mode.composite;

/**
 * Created by Me on 2019/4/13.
 */
public abstract class Entry {

    public abstract int getSize();

    public abstract String getName();

    public void add(Entry entry) {};

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + "(" + getSize() + ")";
    }


}
