package com.me.inner.mode.chain;

/**
 * Created by Me on 2019/4/21.
 */
public class LimitSupport extends Support {

    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {

        if (trouble.getNumber() < limit) {
            return true;
        }

        return false;
    }
}
