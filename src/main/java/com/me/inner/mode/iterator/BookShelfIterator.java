package com.me.inner.mode.iterator;

import java.util.Iterator;

/**
 * Created by yanyanghong on 2019/4/8.
 */
public class BookShelfIterator implements Iterator<Book> {

    private BookShelf bookShelf;
    private int index = 0;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    public boolean hasNext() {
        int length = bookShelf.getBookList().size();
        if (index>=length) {
            return false;
        }

        return true;
    }

    public Book next() {
        Book book = bookShelf.getBookList().get(index);
        index++;
        return book;
    }
}
