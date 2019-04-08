package com.me.inner.mode.adapter.first;

import com.me.inner.mode.ModeTest;

/**
 * Created by Me on 2019/4/8.
 * 适配器模式-适配实现
 */
public class AdapterTest implements ModeTest {

    public void test() {
        Print print = new PrintBanner("YanJinyu");
        print.printStrong();
        print.printWeak();
    }
}
