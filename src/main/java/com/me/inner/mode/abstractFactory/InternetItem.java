package com.me.inner.mode.abstractFactory;

/**
 * Created by yanyanghong on 2019/4/11.
 */
public class InternetItem extends Internet {

    public InternetItem(String caption, String type) {
        super(caption, type);
    }

    @Override
    public void doWhat() {
        System.out.println(caption + "," + type);
    }
}
