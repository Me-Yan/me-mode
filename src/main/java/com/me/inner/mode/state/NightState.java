package com.me.inner.mode.state;

/**
 * Created by Me on 2019/4/22.
 */
public class NightState implements State {

    private static NightState nightState = new NightState();

    private NightState() {

    }

    public static State getInstance() {
        return nightState;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (9 <= hour && 17 < hour) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("使用金库（晚上）");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（晚上）");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("紧急通话（晚上）");
    }

    public String toString() {
        return "[ 晚上 ]";
    }
}
