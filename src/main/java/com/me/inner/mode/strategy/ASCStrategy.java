package com.me.inner.mode.strategy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Me on 2019/4/12.
 */
public class ASCStrategy implements Strategy {

    private int[] dataList;

    @Override
    public void output() {

        for (int i=0; i<dataList.length; i++) {
            for (int j=i+1; j<dataList.length; j++) {
                if (dataList[i]>dataList[j]) {
                    int temp = dataList[j];
                    dataList[j] = dataList[i];
                    dataList[i] = temp;
                }
            }
        }

        System.out.print("ASC:");
        for (int i=0; i<dataList.length; i++) {
            System.out.print(dataList[i]);
            if (i!=dataList.length-1) {
                System.out.print(",");
            }
        }
        System.out.println();

    }

    public void setDataList(int[] dataList) {
        this.dataList = dataList;
    }
}
