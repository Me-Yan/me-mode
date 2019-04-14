package com.me.inner.mode.decorator;

/**
 * Created by Me on 2019/4/14.
 */
public class SideBorder extends Border {

    private String borderChar;

    public SideBorder(String borderChar, Display display) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
