package com.me.inner.mode.facade;

import com.me.inner.mode.ModeTest;

/**
 * Created by Me on 2019/4/21.
 * 外观模式
 */
public class FacadeTest implements ModeTest {
    @Override
    public void test() {
        WordMaker.makeWord("yanyanghong");
    }
}
