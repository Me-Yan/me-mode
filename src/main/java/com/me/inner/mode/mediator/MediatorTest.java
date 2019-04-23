package com.me.inner.mode.mediator;

import com.me.inner.mode.ModeTest;

/**
 * Created by Me on 2019/4/21.
 * 中介者模式
 * 5位开发组成员一起协同工作，当遇到问题时总是意见不同，导致项目进度滞后，
 * 这时候就需要一个项目经理，有问题直接找项目经理，然后项目经理给出最后的决策，
 * 组员之间就不会存在不同的意见了
 */
public class MediatorTest implements ModeTest {
    @Override
    public void test() {
        ProjectManager projectManager = new ProjectManager("YanYanghong");
        projectManager.createItems();

        BedItem bed = (BedItem) projectManager.getBed();
        bed.setManager(projectManager);
        bed.makeChanges();
    }
}
