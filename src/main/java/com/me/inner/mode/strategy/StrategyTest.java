package com.me.inner.mode.strategy;

import com.me.inner.mode.ModeTest;

import java.util.LinkedList;

/**
 * Created by Me on 2019/4/12.
 */
public class StrategyTest implements ModeTest {

    @Override
    public void test() {

        int[] dataList = {10,20,1,32,59,6,8,7,15,4};


        Select select1 = new Select("Select1", new ASCStrategy());
        Select select2 = new Select("Select2", new DESCStrategy());

        select1.insertData(dataList);
        select2.insertData(dataList);

        select1.output();
        select2.output();

    }
}
