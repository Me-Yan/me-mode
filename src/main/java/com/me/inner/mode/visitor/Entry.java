package com.me.inner.mode.visitor;

import java.util.Iterator;

/**
 * Created by Me on 2019/4/21.
 */
public abstract class Entry implements Element {

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws Exception {
        throw new Exception("exception");
    }

    public Iterator iterator() throws Exception {
        throw new Exception("exception");
    }

    public String toString() {
        return getName() + " (" + getSize() + ") ";
    }
}
