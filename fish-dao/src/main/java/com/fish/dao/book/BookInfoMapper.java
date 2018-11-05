package com.fish.dao.book;

import com.fish.dao.sql.SqlProvider;
import com.fish.model.book.BookInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * Created by fish on 2018/11/5.
 */
@Mapper
public interface BookInfoMapper {

    @SelectProvider(type = SqlProvider.class, method = "findBook")
    @Results({
            @Result(property = "id", column = "ID"),
            @Result(property = "bookName", column = "BOOK_NAME"),
            @Result(property = "bookPrice", column = "BOOK_PRICE"),
            @Result(property = "bookImg", column = "BOOK_IMG"),
            @Result(property = "bookTypeId", column = "BOOK_TYPE_ID"),
            @Result(property = "bookDesc", column = "BOOK_DESC"),
            @Result(property = "isHot", column = "IS_HOT"),
            @Result(property = "isShelves", column = "IS_SHELVES"),
            @Result(property = "isDel", column = "IS_DEL"),
            @Result(property = "sort", column = "SORT"),
            @Result(property = "status", column = "STATUS"),
            @Result(property = "modifyDate", column = "MODIFY_DATE"),
            @Result(property = "createDate", column = "CREATE_DATE"),
    })
    BookInfo findBook(BookInfo params);


    @SelectProvider(type = SqlProvider.class, method = "findBook")
    @Results({
            @Result(property = "id", column = "ID"),
            @Result(property = "bookName", column = "BOOK_NAME"),
            @Result(property = "bookPrice", column = "BOOK_PRICE"),
            @Result(property = "bookImg", column = "BOOK_IMG"),
            @Result(property = "bookTypeId", column = "BOOK_TYPE_ID"),
            @Result(property = "bookDesc", column = "BOOK_DESC"),
            @Result(property = "isHot", column = "IS_HOT"),
            @Result(property = "isShelves", column = "IS_SHELVES"),
            @Result(property = "isDel", column = "IS_DEL"),
            @Result(property = "sort", column = "SORT"),
            @Result(property = "status", column = "STATUS"),
            @Result(property = "modifyDate", column = "MODIFY_DATE"),
            @Result(property = "createDate", column = "CREATE_DATE"),
    })
    List<BookInfo> findBookList(BookInfo params);

}
