package com.me.inner.mode.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Me on 2019/4/13.
 */
public class Directory extends Entry {

    private String name;
    private int size;
    private List list = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Entry entry) {
        list.add(entry);
    }

    @Override
    public int getSize() {

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            size += entry.getSize();
        }

        return size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            entry.printList(prefix + "/" + getName());
        }
    }
}
