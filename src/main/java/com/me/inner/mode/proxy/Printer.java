package com.me.inner.mode.proxy;

/**
 * Created by Me on 2019/4/23.
 */
public class Printer implements Printable {

    private String name;

    public Printer() {
        heavyJob("Printer的实例生成中 ");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("Printer的实例生成中("+ name +")");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrintName() {
        return name;
    }

    @Override
    public void print(String str) {
        System.out.println("=== " + name + " ===");
        System.out.println(str);
    }

    public void heavyJob(String str) {
        System.out.print(str);

        for (int i=0; i<5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }

        System.out.println("结束。");
    }
}
