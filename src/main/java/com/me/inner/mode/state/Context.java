package com.me.inner.mode.state;

/**
 * Created by Me on 2019/4/22.
 */
public interface Context {

    void setClock(int hour);

    void changeState(State state);

    void callSecurityCenter(String msg);

    void recordLog(String msg);
}
