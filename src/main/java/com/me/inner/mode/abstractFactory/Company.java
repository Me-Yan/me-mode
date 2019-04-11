package com.me.inner.mode.abstractFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by yanyanghong on 2019/4/11.
 */
public abstract class Company {

    protected String type;

    protected List<Item> itemList = new ArrayList<Item>();

    public Company(String type) {
        this.type = type;
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void createProduct() {
        System.out.println("开始构建。。。");
        Iterator<Item> iterator = itemList.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            item.doWhat();
        }
        System.out.println("结束构建。。。");
    }

}
