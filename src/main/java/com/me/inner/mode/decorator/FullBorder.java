package com.me.inner.mode.decorator;

/**
 * Created by Me on 2019/4/14.
 */
public class FullBorder extends Border {

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getRows() {
        return display.getRows() + 2;
    }

    @Override
    public int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    public String getRowText(int row) {
        if (0 == row) {
            return "+" + makeLine("-") + "+";
        } else if (row == display.getRows() + 1) {
            return "+" + makeLine("-") + "+";
        } else {
            return "|" + display.getRowText(row-1) + "|";
        }
    }

    protected String makeLine(String str) {

        StringBuffer sb = new StringBuffer();
        for (int i=0; i<display.getColumns(); i++) {
            sb.append(str);
        }

        return sb.toString();
    }
}
