package com.me.inner.mode.facade;

/**
 * Created by Me on 2019/4/21.
 */
public class WordWriter {

    public static void writePeriod() {
        System.out.print("。");
    }

    public static void writeComma() {
        System.out.print("，");
    }

    public static void writeWrap() {
        System.out.println();
    }

    public static void writeWord(String word) {
        System.out.print(word);
    }
}
