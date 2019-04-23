package com.me.inner.mode.visitor;

/**
 * Created by Me on 2019/4/21.
 */
public interface Element {

    void accept(Visitor visitor);
}
