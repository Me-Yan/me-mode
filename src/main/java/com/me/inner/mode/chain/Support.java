package com.me.inner.mode.chain;

/**
 * Created by Me on 2019/4/21.
 */
public abstract class Support {

    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;

        return next;
    }

    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (null != next) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println(trouble + "is resolved by " + name + ".");
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + "cannot be resolved.");
    }
}
