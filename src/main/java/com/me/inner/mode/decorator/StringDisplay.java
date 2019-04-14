package com.me.inner.mode.decorator;

/**
 * Created by Me on 2019/4/14.
 */
public class StringDisplay extends Display {

    private String str;

    public StringDisplay(String str) {
        this.str = str;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public int getColumns() {
        return this.str.getBytes().length;
    }

    @Override
    public String getRowText(int row) {
        if (0 == row) {
            return str;
        }

        return null;
    }
}
