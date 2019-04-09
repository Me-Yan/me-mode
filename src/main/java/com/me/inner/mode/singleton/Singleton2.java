package com.me.inner.mode.singleton;

/**
 * Created by Me on 2019/4/9.
 */
public class Singleton2 {

    private static Singleton2 singleton;

    private Singleton2() {
        System.out.println("生成了一个实例2");
    }

    public static Singleton2 getSingleton() {
        if (null==singleton) {
            singleton = new Singleton2();
        }

        return singleton;
    }
}
