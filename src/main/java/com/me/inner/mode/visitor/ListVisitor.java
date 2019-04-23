package com.me.inner.mode.visitor;

import java.util.Iterator;

/**
 * Created by Me on 2019/4/21.
 */
public class ListVisitor extends Visitor {

    private String curDir = "";

    @Override
    public void visit(File file) {
        System.out.println(curDir + "/" + file.toString());
    }

    @Override
    public void visit(Directory directory) {

        try {
            System.out.print(curDir + "/" + directory.getName());

            String saveDir = curDir;

            curDir = curDir + "/" + directory.getName();

            Iterator iterator = directory.iterator();
            while (iterator.hasNext()) {
                Entry entry = (Entry) iterator.next();
                entry.accept(this);
            }

            curDir = saveDir;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
