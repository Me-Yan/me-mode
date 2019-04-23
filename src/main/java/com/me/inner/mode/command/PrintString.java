package com.me.inner.mode.command;

/**
 * Created by Me on 2019/4/23.
 */
public class PrintString implements Printable {

    private ListCommand commands;

    public PrintString(ListCommand commands) {
        this.commands = commands;
    }

    public void execute() {
        commands.execute();
    }

    @Override
    public void output(String str) {
        System.out.println(str);
    }
}
