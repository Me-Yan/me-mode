package com.me.inner.mode.visitor;

/**
 * Created by Me on 2019/4/21.
 */
public abstract class Visitor {

    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
