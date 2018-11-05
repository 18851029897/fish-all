package com.fish.service.book.impl;

import com.fish.dao.book.BookInfoMapper;
import com.fish.model.book.BookInfo;
import com.fish.model.book.BookType;
import com.fish.service.book.IBookInfoService;
import com.fish.service.book.IBookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fish on 2018/11/5.
 */
@Service
public class BookInfoService implements IBookInfoService {

    @Autowired
    private BookInfoMapper bookInfoMapper;


    @Override
    public BookInfo findBook(BookInfo params) {
        return this.bookInfoMapper.findBook(params);
    }

    @Override
    public List<BookInfo> findBookList(BookInfo params) {
        return this.bookInfoMapper.findBookList(params);
    }
}
