package com.me.inner.mode.prototype;

import com.me.inner.mode.ModeTest;

/**
 * Created by Me on 2019/4/9.
 * 原型模式
 */
public class PrototypeTest implements ModeTest {
    @Override
    public void test() {

        Manager manager = new Manager();

        Product product1 = new MessageBox();
        Product product2 = new MessageBox();
        manager.register("message1", product1);
        manager.register("message2", product2);

        Product product3 = new UnderlinePen();
        Product product4 = new UnderlinePen();
        manager.register("underline1", product3);
        manager.register("underline2", product4);

        manager.create("message1").use("message1");
        manager.create("message2").use("message2");

        manager.create("underline1").use("underline1");
        manager.create("underline2").use("underline2");
    }
}
