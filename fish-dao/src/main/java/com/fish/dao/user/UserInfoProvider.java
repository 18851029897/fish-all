package com.fish.dao.user;

import org.apache.ibatis.jdbc.SQL;

/**
 * Created by fishs on 2018/10/29.
 */
public class UserInfoProvider {

    public String findUserList() {
        return new SQL() {{
            SELECT("*");
            FROM("user_info");
        }}.toString();
    }
}
