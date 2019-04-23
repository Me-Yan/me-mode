package com.me.inner.mode.state;

/**
 * Created by Me on 2019/4/22.
 */
public interface State {

    void doClock(Context context, int hour);

    void doUse(Context context);

    void doAlarm(Context context);

    void doPhone(Context context);
}
