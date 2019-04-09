package com.me.inner.mode.singleton;

/**
 * Created by Me on 2019/4/9.
 */
public class Singleton1 {

    private static Singleton1 singleton = new Singleton1();

    private Singleton1() {
        System.out.println("生成了一个实例1");
    }

    public static Singleton1 getSingleton() {
        return singleton;
    }
}
