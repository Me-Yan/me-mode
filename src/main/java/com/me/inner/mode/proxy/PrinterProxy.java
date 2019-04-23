package com.me.inner.mode.proxy;

/**
 * Created by Me on 2019/4/23.
 */
public class PrinterProxy implements Printable {

    private String name;

    private Printer real;

    public PrinterProxy() {

    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrintName() {
        return name;
    }

    @Override
    public void print(String str) {
        realize();
        real.print(str);
    }

    private synchronized void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }
}
