package com.me.inner.mode.adapter.second;

/**
 * Created by Me on 2019/4/8.
 */
public class Banner {

    private String str;

    public Banner(String str) {
        this.str = str;
    }

    public void showWithParen() {
        System.out.println("( " + str +" )");
    }

    public void showWithAster() {
        System.out.println("* " + str +" *");
    }
}
