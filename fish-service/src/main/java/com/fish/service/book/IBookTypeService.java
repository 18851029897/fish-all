package com.fish.service.book;

import com.fish.model.book.BookType;

import java.util.List;

/**
 * Created by fish on 2018/11/5.
 */
public interface IBookTypeService {

    BookType findBookType(BookType params);

    List<BookType> findBookTypeList(BookType params);

}
