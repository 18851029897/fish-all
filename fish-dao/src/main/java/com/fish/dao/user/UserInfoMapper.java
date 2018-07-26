package com.fish.dao.user;

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

    @Select("select user_id as userId, user_nick_name as userNickName from user_info")
    @ResultType(List.class)
    List<UserInfo> findUserList();
}
