package com.me.inner.mode.state;

/**
 * Created by Me on 2019/4/23.
 */
public class FrameContext implements Context {

    private State state = DayState.getInstance();

    @Override
    public void setClock(int hour) {
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        System.out.println("call! " + msg);
    }

    @Override
    public void recordLog(String msg) {
        System.out.println("record ... " + msg);
    }

    public State getState() {
        return state;
    }
}
