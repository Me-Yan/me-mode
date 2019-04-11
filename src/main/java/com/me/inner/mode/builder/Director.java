package com.me.inner.mode.builder;

/**
 * Created by yanyanghong on 2019/4/10.
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        String[] items = {"1. 勇气", "2. 选择", "3. 执行力", "4. 坚持", "5. 努力"};
        builder.makeTitle("迷茫中的明灯");
        builder.makeString("多元化");
        builder.makeItems(items);
        builder.close();
    }
}
