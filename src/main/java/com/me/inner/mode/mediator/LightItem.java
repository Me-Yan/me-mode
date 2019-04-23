package com.me.inner.mode.mediator;

/**
 * Created by Me on 2019/4/21.
 */
public class LightItem implements Item {
    private Manager manager;

    @Override
    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void makeChanges() {
        manager.makeChanges();
    }

    public void doSomething(String str) {
        System.out.println("我是灯泡，亮度为----" + str);
    }
}
