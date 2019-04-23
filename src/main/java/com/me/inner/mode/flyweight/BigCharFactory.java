package com.me.inner.mode.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Me on 2019/4/23.
 */
public class BigCharFactory {

    private static BigCharFactory factory = new BigCharFactory();

    Map pool = new HashMap();

    private BigCharFactory() {

    }

    public static BigCharFactory getInstance() {
        return factory;
    }

    public synchronized BigChar getBigChar(char charname) {
        BigChar bigChar = (BigChar) pool.get("" + charname);
        if (null == bigChar) {
            bigChar = new BigChar(charname);
            pool.put(charname, bigChar);
        }

        return bigChar;
    }
}
