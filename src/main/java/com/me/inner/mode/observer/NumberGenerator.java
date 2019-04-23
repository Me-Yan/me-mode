package com.me.inner.mode.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Me on 2019/4/21.
 */
public abstract class NumberGenerator {

    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    public void noticeObserver(NumberGenerator numberGenerator) {

        Iterator iterator = observerList.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void execute();

}
