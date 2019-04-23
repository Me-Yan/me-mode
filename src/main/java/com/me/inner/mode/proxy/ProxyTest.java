package com.me.inner.mode.proxy;

import com.me.inner.mode.ModeTest;

/**
 * Created by Me on 2019/4/23.
 * 代理模式
 */
public class ProxyTest implements ModeTest {
    @Override
    public void test() {
        PrinterProxy proxy = new PrinterProxy("Alice");
        System.out.println("现在的名字是 " + proxy.getPrintName() + "。");

        proxy.setPrinterName("Bob");
        System.out.println("现在的名字是 " + proxy.getPrintName() + "。");
        proxy.print("我要发财了。");
    }
}
