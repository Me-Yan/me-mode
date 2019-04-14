package com.me.inner.mode.composite;

import com.me.inner.mode.ModeTest;

/**
 * Created by Me on 2019/4/13.
 * 组合模式
 */
public class CompositeTest implements ModeTest {
    @Override
    public void test() {
        Directory root = new Directory("root");

        Directory bin = new Directory("bin");
        Directory vi = new Directory("vi");
        Directory latex = new Directory("latex");

        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");

        Directory yuki = new Directory("yuki");
        File diary = new File("diary.xml", 5000);
        File composite = new File("composite.java", 200);

        Directory hanako = new Directory("hanako");
        File memo = new File("memo.tex", 150);

        Directory tomura = new Directory("tomura");
        File game = new File("game.doc", 350);
        File iunk = new File("iunk.mail", 450);

        tomura.add(game);
        tomura.add(iunk);

        hanako.add(memo);

        yuki.add(diary);
        yuki.add(composite);

        usr.add(yuki);
        usr.add(hanako);
        usr.add(tomura);

        bin.add(vi);
        bin.add(latex);

        root.add(bin);
        root.add(tmp);
        root.add(usr);

        root.printList();

    }
}
