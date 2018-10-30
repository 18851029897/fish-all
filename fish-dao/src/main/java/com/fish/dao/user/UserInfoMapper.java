package com.fish.dao.user;

import com.fish.dao.sql.SqlProvider;
import com.fish.model.user.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by fish on 2018/7/14.
 */
@Mapper
public interface UserInfoMapper {


    @Select("select user_id as userId, user_nick_name as userNickName from user_info where user_id = #{userId}")
    @ResultType(UserInfo.class)
    UserInfo findByUserId(Integer userId);

    //    @Select("select user_id as userId, user_nick_name as userNickName from user_info")
    //    @ResultType(List.class)
    @SelectProvider(type = SqlProvider.class, method = "findUserList")
    @Results({
            @Result(property = "userId", column = "USER_ID"),
            @Result(property = "userNickName", column = "USER_NICK_NAME")
    })
    List<UserInfo> findUserList(UserInfo params);
}
