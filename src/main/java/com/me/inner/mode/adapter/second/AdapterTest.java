package com.me.inner.mode.adapter.second;

import com.me.inner.mode.ModeTest;

/**
 * Created by Me on 2019/4/8.
 * 适配器模式-委托实现
 */
public class AdapterTest implements ModeTest {

    @Override
    public void test() {
        Print print = new PrintBanner("YanYanghong");
        print.printWeak();
        print.printStrong();
    }
}
