package com.me.inner.mode.factoryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Me on 2019/4/9.
 */
public class IDCardFactory extends Factory {

    private List<String>  productList= new ArrayList<String>();

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProduct(Product product) {
        this.productList.add(((IDCard) product).getOwner());
    }
}
