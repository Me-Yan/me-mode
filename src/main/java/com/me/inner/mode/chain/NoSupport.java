package com.me.inner.mode.chain;

/**
 * Created by Me on 2019/4/21.
 */
public class NoSupport extends Support {

    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
