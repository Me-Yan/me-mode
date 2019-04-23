package com.me.inner.mode.command;

import com.me.inner.mode.ModeTest;

/**
 * Created by Me on 2019/4/23.
 * 命令模式
 */
public class CommandTest implements ModeTest {
    @Override
    public void test() {

        ListCommand listCommand = new ListCommand();
        String content = "我要继续加油哦。";

        PrintString printString = new PrintString(listCommand);

        PrintCommand command = new PrintCommand(printString, content);

        listCommand.append(command);

        command.execute();

    }
}
