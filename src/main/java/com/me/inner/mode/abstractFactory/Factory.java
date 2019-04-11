package com.me.inner.mode.abstractFactory;

/**
 * Created by yanyanghong on 2019/4/11.
 */
public abstract class Factory {

    public static Factory getFactory(String clazzName) {

        Factory factory = null;
        try {
            factory = (Factory) Class.forName(clazzName).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return factory;
    }

    public abstract Person hirePerson(String caption, String type);

    public abstract Computer bugComputer(String caption, String type);

    public abstract Internet joinInternet(String caption, String type);

    public abstract Company createCompany(String type);
}
