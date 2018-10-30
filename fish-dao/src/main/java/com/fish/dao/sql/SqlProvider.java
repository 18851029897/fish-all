package com.fish.dao.sql;

import com.fish.model.user.UserInfo;
import com.fish.util.EmptyUtil;
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
                WHERE("user_id=" + params.getUserId());
            }
        }}.toString();
        System.out.println(sql);
        return sql;
    }
}
