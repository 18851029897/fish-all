package com.fish.dao.book;

import com.fish.dao.sql.SqlProvider;
import com.fish.model.book.BookType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * Created by fish on 2018/11/5.
 */
@Mapper
public interface BookTypeMapper {

    @SelectProvider(type = SqlProvider.class, method = "findBookType")
    @Results({
            @Result(property = "id", column = "ID"),
            @Result(property = "typeName", column = "TYPE_NAME"),
            @Result(property = "typeBgImg", column = "TYPE_BG_IMG"),
    })
    BookType findBookType(BookType params);


    @SelectProvider(type = SqlProvider.class, method = "findBookType")
    @Results({
            @Result(property = "id", column = "ID"),
            @Result(property = "typeName", column = "TYPE_NAME"),
            @Result(property = "typeBgImg", column = "TYPE_BG_IMG"),
    })
    List<BookType> findBookTypeList(BookType params);

}
