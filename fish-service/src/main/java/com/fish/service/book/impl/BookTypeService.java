package com.fish.service.book.impl;

import com.fish.dao.book.BookTypeMapper;
import com.fish.model.book.BookType;
import com.fish.service.book.IBookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fish on 2018/11/5.
 */
@Service
public class BookTypeService implements IBookTypeService {

    @Autowired
    private BookTypeMapper bookTypeMapper;

    @Override
    public BookType findBookType(BookType params) {
        return this.bookTypeMapper.findBookType(params);
    }

    @Override
    public List<BookType> findBookTypeList(BookType params) {
        return this.bookTypeMapper.findBookTypeList(params);
    }
}
