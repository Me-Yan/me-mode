package com.me.inner.mode.flyweight;

import com.me.inner.mode.ModeTest;

/**
 * Created by Me on 2019/4/23.
 * 享元模式
 * 即尽量共享实例来避免new出实例，造成大量内存空间的消耗
 */
public class FlyweightTest implements ModeTest {
    @Override
    public void test() {

        BigString string = new BigString("96");
        string.print();
    }
}
