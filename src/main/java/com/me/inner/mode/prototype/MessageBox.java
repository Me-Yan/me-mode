package com.me.inner.mode.prototype;

/**
 * Created by Me on 2019/4/9.
 */
public class MessageBox implements Product {
    @Override
    public void use(String str) {
        for (int i=0; i<10; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println(str);
        for (int i=0; i<10; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return product;
    }
}
