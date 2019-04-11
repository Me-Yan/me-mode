package com.me.inner.mode.abstractFactory;

import com.me.inner.mode.ModeTest;

/**
 * Created by yanyanghong on 2019/4/11.
 * 抽象工厂模式
 */
public class AbstractFactoryTest implements ModeTest {
    @Override
    public void test() {
        Factory factory = Factory.getFactory("com.me.inner.mode.abstractFactory.ProductFactory");
        Computer computer1 = factory.bugComputer("我是电脑", "电脑1");
        Computer computer2 = factory.bugComputer("我是电脑", "电脑2");
        Computer computer3 = factory.bugComputer("我是电脑", "电脑3");

        Person person1 = factory.hirePerson("我是工人", "工人1");
        Person person2 = factory.hirePerson("我是工人", "工人2");
        Person person3 = factory.hirePerson("我是工人", "工人3");

        Internet internet1 = factory.joinInternet("我是网络", "网络1");
        Internet internet2 = factory.joinInternet("我是网络", "网络2");
        Internet internet3 = factory.joinInternet("我是网络", "网络3");

        Company company = factory.createCompany("准备成立公司");

        company.addItem(person1);
        company.addItem(person2);
        company.addItem(person3);

        company.addItem(computer1);
        company.addItem(computer2);
        company.addItem(computer3);

        company.addItem(internet1);
        company.addItem(internet2);
        company.addItem(internet3);

        company.createProduct();
    }
}
