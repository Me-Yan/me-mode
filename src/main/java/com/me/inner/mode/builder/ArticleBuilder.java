package com.me.inner.mode.builder;

/**
 * Created by yanyanghong on 2019/4/10.
 */
public class ArticleBuilder implements Builder {
    @Override
    public void makeTitle(String title) {
        System.out.println(title);
    }

    @Override
    public void makeString(String content) {
        System.out.println(content);
    }

    @Override
    public void makeItems(String[] items) {
        for (int i=0; i<items.length; i++) {
            System.out.println(items[i]);
        }
    }

    @Override
    public void close() {
        System.out.println("close....");
    }
}
