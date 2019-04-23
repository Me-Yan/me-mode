package com.me.inner.mode.chain;

/**
 * Created by Me on 2019/4/21.
 */
public class OddSupport extends Support {

    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {

        if (trouble.getNumber() % 2 == 1) {
            return true;
        }

        return false;
    }
}
