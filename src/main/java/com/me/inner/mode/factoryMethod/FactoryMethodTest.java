package com.me.inner.mode.factoryMethod;

import com.me.inner.mode.ModeTest;

/**
 * Created by Me on 2019/4/9.
 * 工厂方法模式
 */
public class FactoryMethodTest implements ModeTest {
    @Override
    public void test() {
        Factory factory = new IDCardFactory();
        Product product1 = factory.create("YanYanghong");
        Product product2 = factory.create("YanJinyu");

        product1.use();
        product2.use();
    }
}
