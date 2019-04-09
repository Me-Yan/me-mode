package com.me.inner.mode.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Me on 2019/4/9.
 */
public class Manager {

    private Map<String, Product> showcase = new HashMap<String, Product>();

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String name) {
        Product product = showcase.get(name);
        return product.createClone();
    }
}
