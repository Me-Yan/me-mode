package com.me.inner.mode.facade;

import java.util.Properties;

/**
 * Created by Me on 2019/4/21.
 */
public class DataBase {

    public static Properties getProperties() {
        Properties properties = new Properties();
        properties.setProperty("yanyanghong", "25");
        properties.setProperty("yanjinyu", "8");
        properties.setProperty("yanxiang", "33");

        return properties;
    }
}
