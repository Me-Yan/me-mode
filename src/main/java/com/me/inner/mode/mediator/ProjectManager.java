package com.me.inner.mode.mediator;

/**
 * Created by Me on 2019/4/21.
 */
public class ProjectManager implements Manager {

    private String name;

    private Item bed;
    private Item table;
    private Item light;

    public ProjectManager(String name) {
        this.name = name;
    }

    @Override
    public void createItems() {
        bed = new BedItem();
        table = new TableItem();
        light = new LightItem();
    }

    @Override
    public void makeChanges() {
        bed.doSomething("1.5*2.4");
        table.doSomething("0.6*1.2");
        light.doSomething("100");
    }

    public Item getBed() {
        return bed;
    }

    public Item getTable() {
        return table;
    }

    public Item getLight() {
        return light;
    }
}
