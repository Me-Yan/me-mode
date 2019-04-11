package com.me.inner.mode.bridge;

import com.me.inner.mode.ModeTest;

/**
 * Created by Me on 2019/4/11.
 * 桥接模式
 */
public class BridgeTest implements ModeTest {
    @Override
    public void test() {
        Display display = new Display(new StringDisplayImpl("Hello, China."));
        Display display1 = new CountDisplay(new StringDisplayImpl("Hello, ChengDu."));
        CountDisplay countDisplay = new CountDisplay(new StringDisplayImpl("Hello, ChongQing."));

        display.display();
        display1.display();
        countDisplay.display();
    }
}
