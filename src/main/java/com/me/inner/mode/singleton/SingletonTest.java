package com.me.inner.mode.singleton;

import com.me.inner.mode.ModeTest;

/**
 * Created by Me on 2019/4/9.
 * 单例模式
 */
public class SingletonTest implements ModeTest {
    @Override
    public void test() {
        Singleton1 singleton11 = Singleton1.getSingleton();
        Singleton1 singleton12 = Singleton1.getSingleton();

        System.out.println("singleton11 == singleton12 :" + (singleton11 == singleton12));

        Singleton2 singleton21 = Singleton2.getSingleton();
        Singleton2 singleton22 = Singleton2.getSingleton();

        System.out.println("singleton21 == singleton22 :" + (singleton21 == singleton22));

    }
}
