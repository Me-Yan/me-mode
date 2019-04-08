package com.me.inner.mode.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by yanyanghong on 2019/4/8.
 */
public class BookShelf implements Iterable<Book> {

    private List<Book> bookList = new ArrayList<Book>();

    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
