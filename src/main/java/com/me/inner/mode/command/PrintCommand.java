package com.me.inner.mode.command;

/**
 * Created by Me on 2019/4/23.
 */
public class PrintCommand implements Command {

    private Printable printable;
    private String content;

    public PrintCommand(Printable printable, String content) {
        this.printable = printable;
        this.content = content;
    }

    @Override
    public void execute() {
        printable.output(content);
    }
}
