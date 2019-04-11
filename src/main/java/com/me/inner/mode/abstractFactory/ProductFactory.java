package com.me.inner.mode.abstractFactory;

/**
 * Created by yanyanghong on 2019/4/11.
 */
public class ProductFactory extends Factory {
    @Override
    public Person hirePerson(String caption, String type) {
        return new PersonItem(caption, type);
    }

    @Override
    public Computer bugComputer(String caption, String type) {
        return new ComputerItem(caption, type);
    }

    @Override
    public Internet joinInternet(String caption, String type) {
        return new InternetItem(caption, type);
    }

    @Override
    public Company createCompany(String type) {
        return new CompanyItem(type);
    }

}
