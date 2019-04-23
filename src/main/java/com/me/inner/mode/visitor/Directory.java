package com.me.inner.mode.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Me on 2019/4/21.
 */
public class Directory extends Entry {

    private String name;

    private List list = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public Entry add(Entry entry) {
        list.add(entry);

        return this;
    }

    public Iterator iterator() {

        return list.iterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            size = size + entry.getSize();
        }

        return size;
    }
}
