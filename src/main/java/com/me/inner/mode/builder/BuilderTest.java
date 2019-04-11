package com.me.inner.mode.builder;

import com.me.inner.mode.ModeTest;

/**
 * Created by yanyanghong on 2019/4/10.
 * 建造者模式
 */
public class BuilderTest implements ModeTest {
    @Override
    public void test() {
        ArticleBuilder articleBuilder = new ArticleBuilder();
        Director director = new Director(articleBuilder);
        director.construct();
    }
}
