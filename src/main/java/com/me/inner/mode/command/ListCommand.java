package com.me.inner.mode.command;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by Me on 2019/4/23.
 */
public class ListCommand implements Command {

    private Stack stack = new Stack();

    @Override
    public void execute() {

        Iterator iterator = stack.iterator();
        while (iterator.hasNext()) {
            Command command = (Command) iterator.next();
            command.execute();
        }
    }

    public void append(Command command) {
        stack.push(command);
    }

    public void undo(Command command) {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public void clear() {
        stack.clear();
    }
}
