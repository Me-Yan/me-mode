package com.me.inner.mode.iterator;

import com.me.inner.mode.ModeTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by yanyanghong on 2019/4/8.
 *  迭代模式
 */
public class IteratorTest implements ModeTest {
    public void test() {
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("Design Mode1"));
        bookList.add(new Book("Design Mode2"));
        bookList.add(new Book("Design Mode3"));
        bookList.add(new Book("Design Mode4"));
        bookList.add(new Book("Design Mode5"));

        BookShelf bookShelf = new BookShelf();
        bookShelf.setBookList(bookList);

        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
