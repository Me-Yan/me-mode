package com.me.inner.mode.adapter.second;

/**
 * Created by Me on 2019/4/8.
 */
public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String str) {
        this.banner = new Banner(str);
    }

    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithAster();
    }
}
