package com.me.inner.mode.chain;

import com.me.inner.mode.ModeTest;

/**
 * Created by Me on 2019/4/21.
 * 责任链模式
 */
public class ChainTest implements ModeTest {

    @Override
    public void test() {

        NoSupport chain1 = new NoSupport("chain1");
        OddSupport chain2 = new OddSupport("chain2");
        LimitSupport chain3 = new LimitSupport("chain3", 22);
        SpecialSupport chain4 = new SpecialSupport("chain4", 20);
        SpecialSupport chain5 = new SpecialSupport("chain5", 24);

        chain1.setNext(chain2).setNext(chain3).setNext(chain4).setNext(chain5);

        for (int i = 0; i < 25; i++) {
            chain1.support(new Trouble(i));
        }
    }
}
