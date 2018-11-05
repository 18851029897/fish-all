package com.fish.dao.sql;

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

}
