package com.me.inner.mode.memento;

import com.me.inner.mode.ModeTest;

/**
 * Created by Me on 2019/4/21.
 * 备忘录模式
 */
public class MementoTest implements ModeTest {
    @Override
    public void test() {
        Gamer gamer = new Gamer(100);

        Memento memento = gamer.createMemento();

        for (int i=1; i<=20; i++) {
            System.out.println("=====" + i);
            System.out.println("当前状态 : " + gamer);
            gamer.bet();

            System.out.println("所持金钱为" + gamer.getMoney() + "元。");

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("      ( 所持金钱增加了许多，因此保存游戏当前的状态。");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("      ( 所持金钱减少了许多，因此恢复至以前的状态。");
                gamer.restoreGamer(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }

            System.out.println();

        }
    }
}
