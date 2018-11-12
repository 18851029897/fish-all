package com.fish.controller.login.vo;

import com.fish.model.book.BookInfo;

import java.util.List;

/**
 * Created by fishs on 2018/11/5.
 */
public class BookListVO {

    private String type;

    private List<BookInfo> books;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<BookInfo> getBooks() {
        return books;
    }

    public void setBooks(List<BookInfo> books) {
        this.books = books;
    }
}
