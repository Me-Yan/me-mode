package com.me.inner.mode.factoryMethod;

/**
 * Created by Me on 2019/4/9.
 */
public class IDCard extends Product {

    private String owner;

    public IDCard(String owner) {
        System.out.println("制作"+ owner + "的卡片");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用"+ owner + "的卡片");
    }

    public String getOwner() {
        return owner;
    }
}
