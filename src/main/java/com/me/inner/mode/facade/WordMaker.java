package com.me.inner.mode.facade;

import java.util.Properties;

/**
 * Created by Me on 2019/4/21.
 */
public class WordMaker {

    private WordMaker() {

    }

    public static void makeWord(String name) {
        Properties properties =  DataBase.getProperties();
        String age = properties.getProperty("yanyanghong");

        WordWriter.writeWord("严杨鸿");
        WordWriter.writeComma();
        WordWriter.writeWord("你今年就是");
        WordWriter.writeWord(age);
        WordWriter.writeWord("岁了");
        WordWriter.writePeriod();
    }
}
