package com.fish.service.book;

import com.fish.model.book.BookInfo;

import java.util.List;

/**
 * Created by fish on 2018/11/5.
 */
public interface IBookInfoService {

    BookInfo findBook(BookInfo params);

    List<BookInfo> findBookList(BookInfo params);

}
