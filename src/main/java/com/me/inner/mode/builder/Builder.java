package com.me.inner.mode.builder;

/**
 * Created by yanyanghong on 2019/4/10.
 * 建造者模式
 */
public interface Builder {

    void makeTitle(String title);

    void makeString(String content);

    void makeItems(String[] items);

    void close();
}
