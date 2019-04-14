package com.me.inner.mode.decorator;

import com.me.inner.mode.ModeTest;

/**
 * Created by Me on 2019/4/13.
 * 装饰器模式
 */
public class DecoratorTest implements ModeTest {
    @Override
    public void test() {

        Display b1 = new StringDisplay("Fighting, YanYanghong.");

        Display d1 = new SideBorder("|", b1);
        Display d2 = new FullBorder(b1);

        d1.show();
        d2.show();

        Display display = new FullBorder(new FullBorder(new SideBorder("=", new SideBorder("*", b1))));
        display.show();

    }
}
