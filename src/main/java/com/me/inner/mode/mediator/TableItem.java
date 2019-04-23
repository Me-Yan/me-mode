package com.me.inner.mode.mediator;

/**
 * Created by Me on 2019/4/21.
 */
public class TableItem implements Item {
    private Manager manager;

    @Override
    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void makeChanges() {
        manager.makeChanges();
    }

    public void doSomething(String str) {
        System.out.println("我是桌子，长宽为----" + str);
    }
}
