package com.fish.dao.sql;

import com.fish.model.book.BookInfo;
import com.fish.model.book.BookType;
import com.fish.model.user.UserInfo;
import com.fish.common.util.EmptyUtil;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by fish on 2018/10/29.
 */
public class SqlProvider {

    public String findUserList(UserInfo params) {
        String sql = new SQL() {{
            SELECT("*");
            FROM("user_info");
            if (EmptyUtil.isNotEmpty(params.getUserId())) {
                WHERE("USER_ID=" + params.getUserId());
            }
        }}.toString();
        System.out.println(sql);
        return sql;
    }


    public String findBookType(BookType params) {
        String sql = new SQL() {{
            SELECT("*");
            FROM("book_type");
            if (EmptyUtil.isNotEmpty(params.getId())) {
                WHERE("ID=" + params.getId());
            }
            if (EmptyUtil.isNotEmpty(params.getTypeName())) {
                WHERE("TYPE_NAME=" + params.getTypeName());
            }
            if (EmptyUtil.isNotEmpty(params.getTypeBgImg())) {
                WHERE("TYPE_BG_IMG=" + params.getTypeBgImg());
            }
        }}.toString();
        System.out.println(sql);
        return sql;
    }


    public String findBook(BookInfo params) {
        String sql = new SQL() {{
            SELECT("*");
            FROM("book_info");
            if (EmptyUtil.isNotEmpty(params.getId())) {
                WHERE("ID=" + params.getId());
            }
            if (EmptyUtil.isNotEmpty(params.getBookName())) {
                WHERE("BOOK_NAME=" + params.getBookName());
            }
            if (EmptyUtil.isNotEmpty(params.getBookPrice())) {
                WHERE("BOOK_PRICE=" + params.getBookPrice());
            }
            if (EmptyUtil.isNotEmpty(params.getBookImg())) {
                WHERE("BOOK_IMG=" + params.getBookImg());
            }
            if (EmptyUtil.isNotEmpty(params.getBookTypeId())) {
                WHERE("BOOK_TYPE_ID=" + params.getBookTypeId());
            }
            if (EmptyUtil.isNotEmpty(params.getBookDesc())) {
                WHERE("BOOK_DESC=" + params.getBookDesc());
            }
            if (EmptyUtil.isNotEmpty(params.getIsHot())) {
                WHERE("IS_HOT=" + params.getIsHot());
            }
            if (EmptyUtil.isNotEmpty(params.getIsShelves())) {
                WHERE("IS_SHELVES=" + params.getIsShelves());
            }
            if (EmptyUtil.isNotEmpty(params.getIsDel())) {
                WHERE("IS_DEL=" + params.getIsDel());
            }
            if (EmptyUtil.isNotEmpty(params.getSort())) {
                WHERE("SORT=" + params.getSort());
            }
            if (EmptyUtil.isNotEmpty(params.getStatus())) {
                WHERE("STATUS=" + params.getStatus());
            }
        }}.toString();
        System.out.println(sql);
        return sql;
    }
}
