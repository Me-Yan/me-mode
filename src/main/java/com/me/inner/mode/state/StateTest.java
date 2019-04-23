package com.me.inner.mode.state;

import com.me.inner.mode.ModeTest;

import java.util.Random;

/**
 * Created by Me on 2019/4/22.
 * 状态模式
 */
public class StateTest implements ModeTest {
    @Override
    public void test() {

        FrameContext frameContext = new FrameContext();

        frameContext.setClock(new Random().nextInt(23));

        State state = frameContext.getState();

        state.doUse(frameContext);
        state.doAlarm(frameContext);
        state.doPhone(frameContext);

    }
}
