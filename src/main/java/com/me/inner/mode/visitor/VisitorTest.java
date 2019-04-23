package com.me.inner.mode.visitor;

import com.me.inner.mode.ModeTest;

/**
 * Created by Me on 2019/4/14.
 * 访问者模式
 */
public class VisitorTest implements ModeTest {
    @Override
    public void test() {
        ListVisitor visitor = new ListVisitor();

        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory conf = new Directory("conf");
        Directory log = new Directory("log");

        File context = new File("context.xml", 3);
        File server = new File("server.xml", 5);

        conf.add(context);
        conf.add(server);

        root.add(bin);
        root.add(conf);
        root.add(log);

        root.accept(visitor);

    }
}
