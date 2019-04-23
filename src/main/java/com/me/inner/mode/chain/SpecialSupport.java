package com.me.inner.mode.chain;

/**
 * Created by Me on 2019/4/21.
 */
public class SpecialSupport extends Support {

    private int value;

    public SpecialSupport(String name, int value) {
        super(name);
        this.value = value;
    }

    @Override
    protected boolean resolve(Trouble trouble) {

        if (trouble.getNumber() == value) {
            return true;
        }

        return false;
    }
}
