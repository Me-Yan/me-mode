package com.me.inner.mode.templateMode;

import com.me.inner.mode.ModeTest;

/**
 * Created by Me on 2019/4/8.
 */
public class TemplateModeTest implements ModeTest {
    @Override
    public void test() {
        AbstractDisplay display = new StringDisplay();
        display.display();
    }
}
