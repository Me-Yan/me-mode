package com.me.inner.mode.prototype;

/**
 * Created by Me on 2019/4/9.
 */
public interface Product extends Cloneable{

    void use(String str);
    Product createClone();

}
